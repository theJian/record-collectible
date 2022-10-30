package in.chabuduo.recordcollectible;

import in.chabuduo.recordcollectible.item.CRItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecordCollectible implements ModInitializer {

    public static final String MOD_ID = "recordcollectible";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "recordcollectible"),
            () -> new ItemStack(CRItems.DISC));
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        CRItems.registerModItems();
    }
}
