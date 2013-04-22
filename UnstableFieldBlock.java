package hexaguin.motionmodifiers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.world.World;

public class UnstableFieldBlock extends Block {
	public UnstableFieldBlock(int par1)
    {
        super(par1, Material.web);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
	
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
		 this.func_94391_a(par1World, par2, par3, par4, (EntityLiving)null);
    }
	
	public void func_94391_a(World par1World, int par2, int par3, int par4, EntityLiving par6EntityLiving)
    {
        if (!par1World.isRemote)
        {
                ThrownKinetiteBomb kinetiteBomb = new ThrownKinetiteBomb(par1World, (double)((float)par2 + 0.5F), (double)((float)par3 + 0.5F), (double)((float)par4 + 0.5F));
                par1World.spawnEntityInWorld(kinetiteBomb);
        }
    }

}
