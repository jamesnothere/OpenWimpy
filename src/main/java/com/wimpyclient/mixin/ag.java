package com.wimpyclient.mixin;

import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserProperties;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.net.Proxy;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.User;
import net.minecraft.client.multiplayer.ProfileKeyPairManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({Minecraft.class})
public interface ag {
   @Accessor("user")
   @Mutable
   void wimpyclient$setUser(User var1);

   @Accessor("userApiService")
   @Mutable
   void wimpyclient$setUserApiService(UserApiService var1);

   @Accessor("userPropertiesFuture")
   @Mutable
   void wimpyclient$setUserPropertiesFuture(CompletableFuture<UserProperties> var1);

   @Accessor("profileKeyPairManager")
   @Mutable
   void wimpyclient$setProfileKeyPairManager(ProfileKeyPairManager var1);

   @Accessor("profileFuture")
   @Mutable
   void wimpyclient$setProfileFuture(CompletableFuture<ProfileResult> var1);

   @Accessor("proxy")
   Proxy wimpyclient$proxy();
}
