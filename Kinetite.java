package hexaguin.motionmodifiers;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Kinetite extends Item {
	
	public Kinetite(int id) {
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("KinetiteShard");
        // TODO Auto-generated constructor stub
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
	         iconIndex = iconRegister.registerIcon("MotionModifiers:KinetiteShard");
	}
}
