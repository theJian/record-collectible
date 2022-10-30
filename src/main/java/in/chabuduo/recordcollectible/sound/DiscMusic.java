package in.chabuduo.recordcollectible.sound;

import in.chabuduo.recordcollectible.RecordCollectible;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DiscMusic {
    public  static SoundEvent TEST_MUSIC = registerSound("test_music");

    public static void registerModSounds() {
    }

    private static SoundEvent registerSound(String name) {
        Identifier id = new Identifier(RecordCollectible.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
