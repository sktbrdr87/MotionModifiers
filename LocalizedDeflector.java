package hexaguin.motionmodifiers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class LocalizedDeflector extends Block {
	public LocalizedDeflector(int par1)
    {
        super(par1, Material.web);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
    	par5Entity.motionX = 0-par5Entity.motionX*2;
    	//if (par5Entity.motionX>0){
    	//	par5Entity.motionX =+ 2;
    	//} else {
    	//	par5Entity.motionX =- 2;
    	//}
    	par5Entity.motionY = 0-par5Entity.motionY*2;
    	//if (par5Entity.motionY>0){
    	//	par5Entity.motionY =+ 2;
    	//} else {
    	//	par5Entity.motionY =- 2;
    	//}
    	par5Entity.motionZ = 0-par5Entity.motionZ*2;
    	//if (par5Entity.motionZ>0){
    	//	par5Entity.motionZ =+ 2;
    	//} else {
    	//	par5Entity.motionZ =- 2;
    	//}
    	par5Entity.setPosition(par5Entity.lastTickPosX, par5Entity.lastTickPosY, par5Entity.lastTickPosZ);
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    
    public void registerIcons(IconRegister iconRegister){
        blockIcon = iconRegister.registerIcon("MotionModifiers:LocalDeflector");
	}

}
