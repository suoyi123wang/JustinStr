package cn.ios.junit.config;

import cn.ios.junit.enums.GenerationEnum;
import cn.ios.junit.util.log.Log;

import java.io.File;

public class Config {
	public static void configGlobalCons(String targetPath){
		GlobalCons.TEST_SOURCE_FOLDER = targetPath;
		GlobalCons.TEST_OUTPUT_FOLDER = getOutputFolder();
	}

	public static String getOutputFolder() {
		if (GlobalCons.TEST_SOURCE_FOLDER == null || GlobalCons.TEST_SOURCE_FOLDER.isEmpty()) {
			Log.e("targetPath is null or Empty:", GlobalCons.TEST_SOURCE_FOLDER);
		}
		int i = GlobalCons.TEST_SOURCE_FOLDER.lastIndexOf("/");
		return GlobalCons.TEST_SOURCE_FOLDER.substring(0, i + 1) + GenerationEnum.OUTPUT_FOLDER.getValue() +  File.separator;
	}

}