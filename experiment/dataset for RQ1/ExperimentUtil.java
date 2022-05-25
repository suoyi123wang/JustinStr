package cn.ios.junit.util;

import cn.ios.junit.util.log.Log;
import com.github.curiousoddman.rgxgen.RgxGen;
import com.github.curiousoddman.rgxgen.config.RgxGenProperties;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Pattern;

public class ExperimentUtil {
    public static void genString(String regex, String methodName, List<String> tempList) {
        if (methodName.equals("test2")) {
            Log.i(regex);
        }
        Method method = null;
        RgxGenProperties properties = new RgxGenProperties();
        properties.put("generation.infinite.repeat", "10");
        try {
            Class<?> aClass = Class.forName("cn.ios.junit.util.TestCaseUtil1");
            method = aClass.getMethod(methodName, String.class);
            int whileCount = 10000;
            int trueCount = 0, falseCount = 0;
            long start = 0;
            long end = 0;
            long temp = 0;
            RgxGen rgx = new RgxGen(regex);
            rgx.setProperties(properties);
            while (whileCount > 0) {
                start = System.currentTimeMillis();
                String generate = rgx.generate();
                end = System.currentTimeMillis();
                temp = temp + end - start;
                if ((boolean)method.invoke(null,generate)) {
                    trueCount++;
                } else {
                    falseCount++;
                }
                whileCount--;
            }
//            if (methodName.contains("test12")) {
//                Log.i("test12");
//                Log.i("true regex::");
//                Log.i("trueCount: " + trueCount);
//                Log.i("falseCount: " + falseCount);
//                Log.i("Time: " + temp);
//            }

            tempList.add(String.valueOf(trueCount));
            tempList.add(String.valueOf(falseCount));
            tempList.add(String.valueOf(temp));
            whileCount = 10000;
            trueCount = 0;
            falseCount = 0;
            temp = 0;
            Pattern pattern = Pattern.compile(regex);

            RgxGen rgxGen = new RgxGen("[\\s\\S]*");
            rgxGen.setProperties(properties);
            while (whileCount > 0) {
                start = System.currentTimeMillis();
//                String generate = Randomness.nextString(Randomness.nextInt(1, 10));
                String generate = rgxGen.generate();
                while (pattern.matcher(generate).matches()) {
//                    generate = Randomness.nextString(Randomness.nextInt(1, 10));
                    generate = rgxGen.generate();
                }
                end = System.currentTimeMillis();
                temp = temp + end - start;
                if ((boolean)method.invoke(null,generate)) {
                    trueCount++;
                } else {
                    falseCount++;
                }
                whileCount--;
            }
            if (methodName.contains("test12")) {
                Log.i("false regex::");
                Log.i("trueCount: " + trueCount);
                Log.i("falseCount: " + falseCount);
                Log.i("Time: " + temp);
            }
            tempList.add(String.valueOf(trueCount));
            tempList.add(String.valueOf(falseCount));
            tempList.add(String.valueOf(temp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
