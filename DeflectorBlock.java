package hexaguin.motionmodifiers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class DeflectorBlock extends Block {
	
	public DeflectorBlock (int id) {
        super(id,Material.iron);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("DeflectorBlock");
        setCreativeTab(CreativeTabs.tabRedstone);
        setHardness(5);
	}
	
	public void registerIcons(IconRegister iconRegister){
         blockIcon = iconRegister.registerIcon("MotionModifiers:DeflectorBlock");
	}
	

}
