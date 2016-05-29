package harmony.somemod.common.core

import harmony.somemod.common.items.ModItems
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

/**
 * @author ArmyOfAnarchists
 */
class CreativeTab : CreativeTabs("SomeMod") {
    override fun getTabIconItem(): Item {
        return ModItems.TAB
    }

    override fun getTabLabel(): String {
        return "The RC Mod"

    }

    override fun getTranslatedTabLabel(): String {
        return tabLabel
    }
}