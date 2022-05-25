package cn.ios.junit.config;

import cn.ios.junit.constraint.VO.ParamConstraintVO;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import soot.SootMethod;

import java.util.List;
import java.util.Map;
import java.util.Set;
public class GlobalCons {
    public static Map<String,List<String>> FILTER_METHOD_NAME = Maps.newHashMap();
    public static Map<String,List<String>> CONSTRAINT_METHOD_NAME = Maps.newHashMap();

    public static Set<SootMethod> CANDIDATE_METHODS = Sets.newHashSet();

    public static Map<String, Map<String, Map<Integer, ParamConstraintVO>>> PARAM_CONSTRAINTS_VOS = Maps.newHashMap();
    public static String TEST_SOURCE_FOLDER = "";
    public static String TEST_OUTPUT_FOLDER = "";
    public static int MAX_UNIT_VISIT_TIME = 2;
}
