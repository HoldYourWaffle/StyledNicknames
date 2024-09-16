package eu.pb4.stylednicknames.mixin;

import net.minecraft.network.packet.s2c.play.ScoreboardScoreUpdateS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ScoreboardScoreUpdateS2CPacket.class)
public class ScoreboardScoreUpdateS2CPacketMixin {

    @ModifyVariable(method = "<init>", argsOnly = true, at = @At("HEAD"), ordinal = 0)
    private static String injected(String scoreHolderName) {
        return scoreHolderName.toUpperCase();
    }

}
