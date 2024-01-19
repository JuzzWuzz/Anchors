package com.github.gunirs.anchors;

import com.github.gunirs.anchors.blocks.BlockWorldAnchor;
import com.github.gunirs.anchors.handlers.GuiHandler;
import com.github.gunirs.anchors.items.ItemBlockWorldAnchor;
import com.github.gunirs.anchors.tileentity.TileWorldAnchor;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class Registry {
    public static class Blocks {
        public static final Block blockWorldAnchor = new BlockWorldAnchor();

        public static void register() {
            GameRegistry.registerBlock(blockWorldAnchor, ItemBlockWorldAnchor.class, blockWorldAnchor.getUnlocalizedName());
            GameRegistry.addRecipe(new ItemStack(blockWorldAnchor),
                "DGD",
                "GEG",
                "DOD",
                'D', net.minecraft.init.Blocks.diamond_block,
                'G', net.minecraft.init.Blocks.gold_block,
                'E', net.minecraft.init.Items.ender_eye,
                'O', net.minecraft.init.Blocks.obsidian);
        }
    }

    public static class TileEntity {
        public static void register() {
            GameRegistry.registerTileEntity(TileWorldAnchor.class, "tileWorldAnchor");
        }
    }

    public static class Gui {
        public static void register() {
            NetworkRegistry.INSTANCE.registerGuiHandler(Anchors.INSTANCE, new GuiHandler());
        }
    }
}
