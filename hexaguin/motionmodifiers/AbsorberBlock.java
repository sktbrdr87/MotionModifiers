package hexaguin.motionmodifiers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class AbsorberBlock extends Block {
	
	public AbsorberBlock (int id) {
        super(id,Material.iron);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("AbsorberBlock");
        setCreativeTab(CreativeTabs.tabRedstone);
        setHardness(5);
	}
	
	public void registerIcons(IconRegister iconRegister){
        blockIcon = iconRegister.registerIcon("MotionModifiers:AbsorberBlock");
	}

}
