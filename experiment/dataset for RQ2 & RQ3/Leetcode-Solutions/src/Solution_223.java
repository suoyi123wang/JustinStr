//import java.util.*;
//// for title: mini-parser
//public class Solution_223 {
//    int index = 0;
//
//    public NestedInteger deserialize(String s) {
//        if (s.charAt(index) == '[') {
//            index++;
//            NestedInteger ni = new NestedInteger();
//            while (s.charAt(index) != ']') {
//                ni.add(deserialize(s));
//                if (s.charAt(index) == ',') {
//                    index++;
//                }
//            }
//            index++;
//            return ni;
//        } else {
//            boolean negative = false;
//            if (s.charAt(index) == '-') {
//                negative = true;
//                index++;
//            }
//            int num = 0;
//            while (index < s.length() && Character.isDigit(s.charAt(index))) {
//                num = num 10 + s.charAt(index) - '0';
//                index++;
//            }
//            if (negative) {
//                num= -1;
//            }
//            return new NestedInteger(num);
//        }
//    }
//}
//
//public interface NestedInteger {
//    public NestedInteger();
//    public NestedInteger(int value);
//    public boolean isInteger();
//    public Integer getInteger();
//    public void setInteger(int value);
//    public void add(NestedInteger ni);
//    public List<NestedInteger> getList();
//}
//
//
