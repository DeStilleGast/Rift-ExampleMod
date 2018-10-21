package com.DeStilleGast.Example.Rift;

import org.dimdev.riftloader.listener.InitializationListener;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

/**
 * Created by DeStilleGast on 21-10-2018.
 */
public class Loader implements InitializationListener {

    //Using InitializationListeren to register our mixin config
    @Override
    public void onInitialization() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixin.example.json");
        System.out.println("HelloWorld");
    }
}
