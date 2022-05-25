package cn.ios.junit;

import cn.ios.junit.config.Config;
import cn.ios.junit.config.GlobalCons;
import cn.ios.junit.config.SootConfig;
import cn.ios.junit.constraint.ConstraintFactory;
import cn.ios.junit.data.Writer;

import java.util.HashMap;

public class API {
	public static void main(String[] args) {
		if (args.length == 2) {
			API.generateClassList(args[0], args[1]);
			Writer.processGeneratedConstraints();
		}
	}
	public static void generateClassList(String jrePath, String target) {
		GlobalCons.PARAM_CONSTRAINTS_VOS = new HashMap<>();
		Config.configGlobalCons(target);
		SootConfig.configurator(jrePath);
		ConstraintFactory.processConstraints();
	}
}