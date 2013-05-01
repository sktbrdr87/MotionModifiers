package hexaguin.motionmodifiers;

import cpw.mods.fml.common.registry.TickRegistry;

public class CommonProxy {
	public static String ITEMS_PNG = "/tutorial/generic/items.png";
    public static String BLOCK_PNG = "/tutorial/generic/block.png";
   
    // Client stuff
    public void registerRenderers() {
            // Nothing here as the server doesn't render graphics!
    }
    
    public int addArmor(String armor){
    	return 0;
    }
    

}
