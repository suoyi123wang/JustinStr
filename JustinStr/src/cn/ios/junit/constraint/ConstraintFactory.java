package cn.ios.junit.constraint;

import cn.ios.junit.config.GlobalCons;
import cn.ios.junit.constraint.generate.GenConstraints;
import cn.ios.junit.util.log.Log;

public class ConstraintFactory {
    public static void processConstraints(){
        GlobalCons.PARAM_CONSTRAINTS_VOS = GenConstraints.getConstraintsFromDirectIf();
        if (GlobalCons.PARAM_CONSTRAINTS_VOS.isEmpty()) {
            Log.e("Can not obtain constraints");
        }
    }
}
