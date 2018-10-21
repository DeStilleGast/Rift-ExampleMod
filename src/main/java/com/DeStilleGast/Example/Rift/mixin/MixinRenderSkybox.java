package com.DeStilleGast.Example.Rift.mixin;

import net.minecraft.client.renderer.RenderSkybox;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Created by DeStilleGast on 21-10-2018.
 */
@Mixin(RenderSkybox.class)
public class MixinRenderSkybox {

    // This must be the same name as in the original class
    @Shadow private float time;

    // method -> refer to this method
    // at -> where you want to place it (HEAD -> start, RETURN -> before return, you can define it with other options)
    @Inject(method = "render", at = @At("RETURN"))
    public void drawScreen(float particleTick, CallbackInfo ci) {
        time += 3; // speedup the skybox
    }
}
