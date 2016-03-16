package techreborn.blocks.transformers;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import techreborn.blocks.storage.BlockBatBox;
import techreborn.client.TechRebornCreativeTab;
import techreborn.tiles.storage.TileMFE;
import techreborn.tiles.transformers.TileLVTransformer;

/**
 * Created by modmuss50 on 16/03/2016.
 */
public class BlockLVTransformer extends BlockBatBox {

    public BlockLVTransformer() {
        super();
        setUnlocalizedName("techreborn.lvt");
        setCreativeTab(TechRebornCreativeTab.instance);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int p_149915_2_) {
        return new TileLVTransformer();
    }

    @Override
    public String getFrontOff() {
        return prefix + "lvt_front";
    }

    @Override
    public String getFrontOn() {
        return prefix + "lvt_front";
    }

    @Override
    public String getSide() {
        return prefix + "lvt_side";
    }

    @Override
    public String getTop() {
        return prefix + "lvt_top";
    }

    @Override
    public String getBottom() {
        return prefix + "lvt_bottom";
    }
}