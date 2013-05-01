package hexaguin.motionmodifiers;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KineticArray extends Item {
	
	public KineticArray(int id) {
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("KineticArray");
        // TODO Auto-generated constructor stub
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
	         iconIndex = iconRegister.registerIcon("MotionModifiers:KineticArray");
	}
}
