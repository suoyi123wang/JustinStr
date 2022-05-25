package cn.ios.junit.util;

import com.google.common.collect.Lists;
import soot.SootClass;
import soot.SootMethod;
import soot.Type;

import java.util.ArrayList;
import java.util.List;

public class ClassUtil {

    public static boolean isIgnoredClass(SootClass sootClass) {
        return sootClass.isPrivate() || sootClass.isAbstract() ||
                sootClass.isInterface() || sootClass.isInnerClass() || sootClass.getName().contains("lambda") || sootClass.getName().contains("$");
    }

    public static boolean isIgnoredMethod(SootMethod sootMethod) {
        if (sootMethod.isPrivate() || sootMethod.isAbstract() ||
                sootMethod.isConstructor() ||
                sootMethod.getName().contains("lambda") ||
                sootMethod.getDeclaration().contains("volatile") ||
                sootMethod.getDeclaration().contains("transient") || sootMethod.getName().contains("$")) return true;
        for (Type paramType : new ArrayList<>(sootMethod.getParameterTypes())) {
            if (TypeUtil.isStringType(paramType)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isInheritedFromGivenClass(SootClass sootClass, String classNameUnderMatch){
        if (sootClass == null || classNameUnderMatch == null || classNameUnderMatch.isEmpty()) {
            return false;
        }
        List<Boolean> booleans = Lists.newArrayList();
        booleans.add(false);
        inheritedFromGivenClass(sootClass, classNameUnderMatch, booleans);
        return booleans.get(0);
    }

    private static void inheritedFromGivenClass(SootClass sootClass, String classNameUnderMatch, List<Boolean> booleans) {
        if (sootClass.getName().equals(classNameUnderMatch)) {
            booleans.set(0,true);
            return;
        }else if (sootClass.getInterfaces() != null) {
            ArrayList<SootClass> interfaces = new ArrayList<>(sootClass.getInterfaces());
            if (!interfaces.isEmpty()) {
                for (SootClass anInterface : interfaces) {
                    inheritedFromGivenClass(anInterface, classNameUnderMatch, booleans);
                }
            }

        } else if (sootClass.hasSuperclass()) {
            isInheritedFromGivenClass(sootClass.getSuperclass(), classNameUnderMatch);
        }
    }
}