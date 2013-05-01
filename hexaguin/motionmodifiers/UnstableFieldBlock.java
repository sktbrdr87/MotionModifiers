package hexaguin.motionmodifiers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class UnstableFieldBlock extends Block {
	public UnstableFieldBlock(int par1)
    {
        super(par1, Material.web);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
	
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
		par5Entity.posX = Math.random()*1000;
		par5Entity.posY = Math.random()*1000;
		par5Entity.posZ = Math.random()*1000;
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    
    public void registerIcons(IconRegister iconRegister){
        blockIcon = iconRegister.registerIcon("MotionModifiers:UnstableField");
	}

}
