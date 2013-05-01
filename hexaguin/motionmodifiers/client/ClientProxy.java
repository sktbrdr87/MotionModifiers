package hexaguin.motionmodifiers.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.RenderFireball;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import hexaguin.motionmodifiers.CommonProxy;
import hexaguin.motionmodifiers.ThrownKinetiteBomb;

public class ClientProxy extends CommonProxy {
	@Override
    public void registerRenderers() {
            MinecraftForgeClient.preloadTexture(ITEMS_PNG);
            MinecraftForgeClient.preloadTexture(BLOCK_PNG);
            
            EntityRegistry.registerGlobalEntityID(ThrownKinetiteBomb.class, "ThrownKinetiteBomb", ModLoader.getUniqueEntityId());
    }
    
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

}
