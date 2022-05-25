package cn.ios.junit.data;

import cn.ios.junit.config.GlobalCons;
import cn.ios.junit.constraint.VO.ParamConstraintVO;
import com.alibaba.fastjson.JSON;
import com.github.curiousoddman.rgxgen.RgxGen;
import com.github.curiousoddman.rgxgen.config.RgxGenProperties;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.commons.text.StringEscapeUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class Writer {
    public static void processGeneratedConstraints(){
        Map<String,Map<String,Map<String,Set<String>>>> regexResult = Maps.newHashMap();
        Map<String,Map<String,Map<String,Set<String>>>> stringDataResult = Maps.newHashMap();

        Map<String, Map<String, Map<Integer, ParamConstraintVO>>> paramConstraintsVos = GlobalCons.PARAM_CONSTRAINTS_VOS;
        for (String className : paramConstraintsVos.keySet()) {
            Map<String, Map<Integer, ParamConstraintVO>> stringMapMap = paramConstraintsVos.get(className);
            Map<String,Map<String,Set<String>>> methodXlsMap = Maps.newHashMap();
            Map<String,Map<String,Set<String>>> methodXlsMap1 = Maps.newHashMap();

            for (String methodSig : stringMapMap.keySet()) {
                Map<Integer, ParamConstraintVO> methodConstraints = stringMapMap.get(methodSig);
                Map<String ,Set<String>> integerXlsMap = Maps.newHashMap();
                Map<String ,Set<String>> integerXlsMap1 = Maps.newHashMap();
                for (Integer index : methodConstraints.keySet()) {
                    ParamConstraintVO paramConstraintVO = methodConstraints.get(index);
                    Set<String> possibleValuesForSimpleType = paramConstraintVO.getPossibleValuesForSimpleType();
                    Set<String> originRegexSet = Sets.newHashSet();
                    if (possibleValuesForSimpleType != null && !possibleValuesForSimpleType.isEmpty()) {
                        for (String s : possibleValuesForSimpleType) {
                            if (s.isEmpty()) continue;
                            originRegexSet.add(s.split("##")[0]);
                        }
                    }

                    if (!originRegexSet.isEmpty()) {
                        integerXlsMap.put(String.valueOf(index), originRegexSet);
                        Set<String> strings = genToStr(originRegexSet);
                        integerXlsMap1.put(String.valueOf(index),strings);
                    }
                }

                if (!integerXlsMap.isEmpty()) {
                    methodXlsMap.put(methodSig,integerXlsMap);
                    methodXlsMap1.put(methodSig,integerXlsMap1);
                }
            }

            if (!methodXlsMap.isEmpty()) {
                regexResult.put(className,methodXlsMap);
                stringDataResult.put(className,methodXlsMap1);
            }
        }

        writeRegexJSON(regexResult);
        writeTestDataJSON(stringDataResult);

    }

    public static void writeRegexJSON(Map<String,Map<String,Map<String ,Set<String>>>> regexResult){
        String json = JSON.toJSONString(regexResult);
        String path = System.getProperty("user.dir") + "/regex.json";

        try {
            FileWriter fw = new FileWriter(new File(path));
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(json);
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeTestDataJSON(Map<String,Map<String,Map<String ,Set<String>>>> stringDataResult){
        String json = JSON.toJSONString(stringDataResult);
        String path = System.getProperty("user.dir") + "/stringData.json";

        try {
            FileWriter fw = new FileWriter(new File(path));
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(json);
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Set<String> genToStr(Set<String> regexSet){
        Set<String> result = Sets.newHashSet();
        for (String regex : regexSet) {
            if (regex.isEmpty()) continue;
            String replace = regex.replace("\\Q\\\\E","\\Q\\\\\\E");
            while (!regex.equals(replace)) {
                regex = replace;
                replace = regex.replace("\\Q\\\\E","\\Q\\\\\\E");
            }
            RgxGenProperties properties = new RgxGenProperties();
            properties.put("generation.infinite.repeat", 20);
            int i = 3;
            while (i >= 0) {
                if (regex.equals("?")) regex = Pattern.quote("?");
                RgxGen rgxGen = new RgxGen(regex);
                try {
                    String value = rgxGen.generate();
                    value = StringEscapeUtils.escapeJava(value);
                    result.add(value);
                } catch (Exception | Error e) {
                }
                i--;
            }
        }
        return result;
    }

}
