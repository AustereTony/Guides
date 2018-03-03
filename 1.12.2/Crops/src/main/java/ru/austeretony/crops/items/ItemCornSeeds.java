package ru.austeretony.crops.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import ru.austeretony.crops.main.BlocksRegistry;

public class ItemCornSeeds extends ItemSeeds {

	public ItemCornSeeds(String name) {
		
		super(BlocksRegistry.CROP_CORN, Blocks.FARMLAND);
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
    /*public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos position, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	
        ItemStack itemStack = player.getHeldItem(hand);
        
        IBlockState blockState = world.getBlockState(position);
        
        if (facing == EnumFacing.UP && player.canPlayerEdit(position.offset(facing), facing, itemStack) && blockState.getBlock() == Blocks.GRASS && world.isAirBlock(position.up())) {
            
        	world.setBlockState(position.up(), this.getPlant(world, position));

            if (player instanceof EntityPlayerMP) {
            	
                CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP) player, position.up(), itemStack);
            }

            itemStack.shrink(1);
            
            return EnumActionResult.SUCCESS;
        }

        return EnumActionResult.FAIL;
    }*/
}
