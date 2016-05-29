import harmony.somemod.common.core.CommonProxy
import harmony.somemod.common.core.CreativeTab
import harmony.somemod.common.lib.LibMisc
import net.minecraft.creativetab.CreativeTabs
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

/**
 * @author ArmyOfAnarchists
 */
@Mod(modid = LibMisc.MODID, version = LibMisc.VERSION)
class SomeMod {
    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        proxy!!.preInit(event)
        MinecraftForge.EVENT_BUS.register(this)
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        proxy!!.init(event)
    }

    @Mod.EventHandler
    fun postInit(event: FMLPostInitializationEvent) {
        proxy!!.postInit(event)
    }

    companion object {
        @Mod.Instance
        var instance: SomeMod? = null
        val TAB: CreativeTabs = CreativeTab()
        @SidedProxy(clientSide = LibMisc.PROXY_CLIENT, serverSide = LibMisc.PROXY_COMMON)
        var proxy: CommonProxy? = null
    }
}