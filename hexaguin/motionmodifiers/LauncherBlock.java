package hexaguin.motionmodifiers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class LauncherBlock extends Block {
	
	public LauncherBlock (int id) {
        super(id,Material.iron);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("LauncherBlock");
        setCreativeTab(CreativeTabs.tabDecorations);
        setHardness(5);
	}
	
	public void registerIcons(IconRegister iconRegister){
         blockIcon = iconRegister.registerIcon("MotionModifiers:LauncherBlock");
	}
	
	public void onEntityWalking(World world, int x, int y, int z, Entity entity)
    {
    	// Add to the entities upward velocity to send them up into the air
		entity.motionY += 2.0;
    }
	
	

}
