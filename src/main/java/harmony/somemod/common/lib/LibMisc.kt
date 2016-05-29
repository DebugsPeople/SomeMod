package harmony.somemod.common.lib

/**
 * @author ArmyOfAnarchists
 */
object LibMisc {
    // Mod Constants
    const val MOD_ID = "somemod"
    const val MOD_NAME = "SomeMod"
    const val BUILD = "GRADLE:BUILD";
    const val VERSIONID = "GRADLE:VERSION";
    const val VERSION = VERSIONID + "." + BUILD;
    const val MC_VERSIONS = "[1.9.4]"

    // Network Contants
    val NETWORK_CHANNEL = MOD_ID

    // Proxy Constants
    const val PROXY_COMMON = "harmony.somemod.common.core.CommonProxy"
    const val PROXY_CLIENT = "harmony.somemod.client.core.ClientProxy"
}