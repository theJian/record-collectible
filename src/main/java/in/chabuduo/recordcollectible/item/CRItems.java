package in.chabuduo.recordcollectible.item;

import in.chabuduo.recordcollectible.RecordCollectible;
import in.chabuduo.recordcollectible.sound.DiscMusic;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CRItems {

    public static final Item DISC = registerItem("disc", new CollectibleDiscItem(
            5,
            DiscMusic.TEST_MUSIC,
            new FabricItemSettings().group(RecordCollectible.ITEM_GROUP).maxCount(1)));

    public static void registerModItems() {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RecordCollectible.MOD_ID, name), item);
    }

}
