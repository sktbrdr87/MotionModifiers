package hexaguin.motionmodifiers;
//imports
import net.minecraft.block.Block;


import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="MotionModifiers", name="Motion Modifiers", version="0.1.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MotionModifiers {
	@Instance("MotionModifiers")
	public static MotionModifiers instance;
	
	
	private final static Item kinetite = new Kinetite(5000);
	private final static Item kineticArray = new KineticArray(5001);
	private final static Item kinetiteBomb = new KinetiteBomb(5002);
	
		
	
	public final static Block deflectorBlock = new DeflectorBlock(500);
	public final static Block absorberBlock = new AbsorberBlock(501);
	public final static Block launcherBlock = new LauncherBlock(502);
	public final static Block launcherBlockB = new LauncherBlockB(503);
	public final static Block inlineLauncher = new InlineLauncher(504);
	public final static Block localizedDeflector = new LocalizedDeflector(505);
	public final static Block speedBlock = new SpeedBlock(506);
	public final static Block unstableField = new UnstableFieldBlock(507);

	@SidedProxy(clientSide="hexaguin.motionmodifiers.client.ClientProxy", serverSide="hexaguin.motionmodifiers.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    }
	
	@Init
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
            LanguageRegistry.addName(kinetite, "Kinetite Shard");
            LanguageRegistry.addName(kineticArray, "Kinetic Array");
            LanguageRegistry.addName(deflectorBlock, "Deflector");
            LanguageRegistry.addName(absorberBlock, "Kinetic Absorber");
            LanguageRegistry.addName(kinetiteBomb, "Handheld Kinetic Blast Device");
            LanguageRegistry.addName(launcherBlock, "Rapid Vertical Momentum Booster");
            LanguageRegistry.addName(launcherBlockB, "Rapid Vertical Momentum Booster");
            LanguageRegistry.addName(inlineLauncher, "Inline Vertical Momentum Booster");
            LanguageRegistry.addName(localizedDeflector, "Stabilized Local Deflection Field WIP AND BUGGY!"); //Removed until I can figure out how this breaks.
            LanguageRegistry.addName(speedBlock, "Rapid Velocity Enchancer");
            LanguageRegistry.addName(unstableField, "Unstable Kinetic Field");
            
            GameRegistry.registerBlock(deflectorBlock);
            GameRegistry.registerBlock(absorberBlock);
            GameRegistry.registerBlock(launcherBlock);
            GameRegistry.registerBlock(launcherBlockB);
            GameRegistry.registerBlock(inlineLauncher);
            GameRegistry.registerBlock(localizedDeflector);
            GameRegistry.registerBlock(speedBlock);
            GameRegistry.registerBlock(unstableField);
            MinecraftForge.setBlockHarvestLevel(deflectorBlock, "Pickaxe", 2);
            MinecraftForge.setBlockHarvestLevel(absorberBlock, "Pickaxe", 2);
            MinecraftForge.setBlockHarvestLevel(launcherBlock, "Pickaxe", 2);
            MinecraftForge.setBlockHarvestLevel(launcherBlockB, "Pickaxe", 2);
            MinecraftForge.setBlockHarvestLevel(inlineLauncher, "Pickaxe", 2);
            MinecraftForge.setBlockHarvestLevel(speedBlock, "Pickaxe", 2);
            
            ItemStack pearlStack = new ItemStack(Item.enderPearl);
            ItemStack diamondStack = new ItemStack(Item.diamond);
            ItemStack quartzBlockStack = new ItemStack(Block.blockNetherQuartz);
            ItemStack glassStack = new ItemStack(Block.glass);
            ItemStack blazeStack = new ItemStack(Item.blazeRod);
            ItemStack stonePlateStack = new ItemStack(Block.pressurePlateStone);
            ItemStack redstoneStack = new ItemStack(Item.redstone);
            ItemStack ironBlockStack = new ItemStack(Block.blockSteel);
            ItemStack shardStack = new ItemStack(MotionModifiers.kinetite);
            ItemStack deflectorStack = new ItemStack(MotionModifiers.deflectorBlock);
            ItemStack arrayStack = new ItemStack(MotionModifiers.kineticArray);
            ItemStack absorberStack = new ItemStack(MotionModifiers.absorberBlock);
            ItemStack launcherStack = new ItemStack(MotionModifiers.launcherBlock);
            ItemStack launcherBStack = new ItemStack(MotionModifiers.launcherBlockB);
            ItemStack inlineLauncherStack = new ItemStack(MotionModifiers.inlineLauncher,16);
            ItemStack localizedDeflectorStack = new ItemStack(MotionModifiers.localizedDeflector,64);
            ItemStack speedBlockStack = new ItemStack(MotionModifiers.speedBlock,64);
            GameRegistry.addShapedRecipe(arrayStack, " x ","xyx"," x ", 'x', shardStack, 'y',pearlStack);
            GameRegistry.addShapedRecipe(deflectorStack, "xyx","yzy","xyx", 'x',ironBlockStack, 'y',redstoneStack, 'z',arrayStack);
            GameRegistry.addShapedRecipe(shardStack, " xy","xzx","yx ", 'x',pearlStack, 'y',diamondStack, 'z',quartzBlockStack);
            GameRegistry.addShapedRecipe(absorberStack, "xxx","xyx","xxx", 'x',deflectorStack,'y',blazeStack);
            GameRegistry.addShapedRecipe(launcherStack, "xyx", 'x', shardStack, 'y', stonePlateStack);
            GameRegistry.addShapedRecipe(launcherBStack, "xyx","xzx", 'x',launcherStack, 'y',redstoneStack, 'z',stonePlateStack);
            GameRegistry.addShapelessRecipe(inlineLauncherStack, launcherBStack,glassStack);
            GameRegistry.addShapelessRecipe(localizedDeflectorStack, deflectorStack,pearlStack);
            GameRegistry.addShapedRecipe(speedBlockStack, "xxx","xyx","xxx", 'x',shardStack,'y',launcherBStack);
            
            
    }
   
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
	
}