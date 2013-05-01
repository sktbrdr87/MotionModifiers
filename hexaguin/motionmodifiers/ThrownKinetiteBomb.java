package hexaguin.motionmodifiers;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ThrownKinetiteBomb extends EntityThrowable {
	public ThrownKinetiteBomb(World par1World)
    {
        super(par1World);
    }
	
	
	
	public ThrownKinetiteBomb(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
    }
	
	@Override
	protected float getGravityVelocity()
    {
        return 0F;
    }

    public ThrownKinetiteBomb(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    
    private void explode()
    {
        float f = 20.0F;
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, f, true);
    }

	@Override
	protected void onImpact(MovingObjectPosition movingobjectposition) {
		if (movingobjectposition.entityHit != null)
        {
            byte b0 = 0;

            if (movingobjectposition.entityHit instanceof EntityBlaze)
            {
                b0 = 3;
            }

            movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), b0);
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
            this.explode();
        }
	}
	
		
}
