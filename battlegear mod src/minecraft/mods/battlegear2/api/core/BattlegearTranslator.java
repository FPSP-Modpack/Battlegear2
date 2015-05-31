package mods.battlegear2.api.core;

/**
 * Core Translator for Battlegear Coremod and Reflection usage
 * Allows to run Battlegear in both dev and "srg" (post- FMLDeobfuscatingRemapper) environments
 */
public class BattlegearTranslator {
    //Setting this to true will enable the output of all edited classes as .class files
    public static boolean debug = false;
    public static boolean obfuscatedEnv;

    public static String getMapedFieldName(String fieldName, String devName) {
        return obfuscatedEnv?fieldName:devName;
    }

    public static String getMapedClassName(String className) {
    	return new StringBuilder("net/minecraft/").append(className.replace(".", "/")).toString();
    }

    public static String getMapedMethodName(String methodName, String devName) {
        return obfuscatedEnv?methodName:devName;
    }
}