package hexaguin.motionmodifiers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class SpeedBlock extends Block {
	public SpeedBlock (int id) {
        super(id,Material.iron);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("SpeedBlock");
        setCreativeTab(CreativeTabs.tabMisc);
        setHardness(5);
        this.slipperiness = 1.5F;
	}
	
	public void registerIcons(IconRegister iconRegister){
         blockIcon = iconRegister.registerIcon("MotionModifiers:SpeedBlock");
	}

}
