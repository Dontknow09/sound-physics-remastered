package com.sonicether.soundphysics;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class MixinConnector implements IMixinConnector {

    @Override
    public void connect() {
        Mixins.addConfiguration("assets/" + SoundPhysicsMod.MODID + "/sound_physics_remastered.mixins.json");
    }

}

