$ErrorActionPreference = 'Stop'

$cred = "protocol=https`nhost=github.com`n`n" | git credential fill
$token = ($cred | Where-Object { $_ -like 'password=*' }) -replace '^password=', ''
if (-not $token) { Write-Output 'NO STORED TOKEN'; exit 1 }

$headers = @{
    Authorization          = "Bearer $token"
    Accept                 = 'application/vnd.github+json'
    'X-GitHub-Api-Version' = '2022-11-28'
}
$repo = 'jamesnothere/OpenWimpy'
$tag = 'v1.0.18'

$rel = Invoke-RestMethod -Headers $headers -Uri "https://api.github.com/repos/$repo/releases/tags/$tag"

$assets = Invoke-RestMethod -Headers $headers -Uri "https://api.github.com/repos/$repo/releases/$($rel.id)/assets"
foreach ($a in $assets) {
    if ($a.name -eq 'openwimpy-1.0.18.jar') {
        Invoke-RestMethod -Method Delete -Headers $headers -Uri "https://api.github.com/repos/$repo/releases/assets/$($a.id)" | Out-Null
        Write-Output "deleted old asset $($a.id)"
    }
}

$notes = @"
Reconstructed source build of WimpyClient 1.0.18 for Minecraft 1.21.11 (Fabric).

- Built from the source tree in this repository
- Requires Fabric Loader 0.20.1+ and Java 21
- NanoVG natives bundled for Windows, Linux, and macOS (x64 + arm64)
- License activation is local-only: no key server, no payload download, modules unlock without a key
"@
$body = @{ body = $notes } | ConvertTo-Json
Invoke-RestMethod -Method Patch -Headers $headers -Uri "https://api.github.com/repos/$repo/releases/$($rel.id)" -Body $body -ContentType 'application/json' | Out-Null
Write-Output "release notes updated"

$jar = 'build\libs\openwimpy-1.0.18.jar'
$upload = "https://uploads.github.com/repos/$repo/releases/$($rel.id)/assets?name=openwimpy-1.0.18.jar"
$resp = Invoke-RestMethod -Method Post -Headers $headers -Uri $upload -ContentType 'application/java-archive' -InFile $jar
Write-Output "asset uploaded: $($resp.name) | $([math]::Round($resp.size / 1MB, 1)) MB"
Write-Output "url: $($resp.browser_download_url)"
