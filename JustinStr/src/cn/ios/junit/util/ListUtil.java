package cn.ios.junit.util;

import com.google.common.collect.Lists;

import java.util.List;

public class ListUtil {

    public static <T> T getLastElement(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static void removeLastElement(List<?> list) {
        if (list == null || list.isEmpty()) return;
        list.remove(list.size() - 1);
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<T> newList = Lists.newArrayList();
        for (int i = list.size() - 1; i > -1; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }
}
