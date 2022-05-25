import java.util.*;
// for title: time-based-key-value-store
public class Solution_116 {
    public class Pair implements Comparable<Pair> {
        int timestamp;
        String value;

        public Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }

        public int hashCode() {
            return timestamp + value.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof Pair) {
                Pair pair2 = (Pair) obj;
                return this.timestamp == pair2.timestamp && this.value.equals(pair2.value);
            }
            return false;
        }

        public int compareTo(Pair pair2) {
            if (this.timestamp != pair2.timestamp) {
                return this.timestamp - pair2.timestamp;
            } else {
                return this.value.compareTo(pair2.value);
            }
        }
    }

    Map<String, List<Pair>> map;

    public Solution_116() {
        map = new HashMap<String, List<Pair>>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<Pair> pairs = map.getOrDefault(key, new ArrayList<Pair>());
        pairs.add(new Pair(timestamp, value));
        map.put(key, pairs);
    }
    
    public String get(String key, int timestamp) {
        List<Pair> pairs = map.getOrDefault(key, new ArrayList<Pair>());
        // 使用一个大于所有 value 的字符串，以确保在 pairs 中含有 timestamp 的情况下也返回大于 timestamp 的位置
        Pair pair = new Pair(timestamp, String.valueOf((char) 127));
        int i = binarySearch(pairs, pair);
        if (i > 0) {
            return pairs.get(i - 1).value;
        }
        return "";
    }

    private int binarySearch(List<Pair> pairs, Pair target) {
        int low = 0, high = pairs.size() - 1;
        if (high < 0 || pairs.get(high).compareTo(target) <= 0) {
            return high + 1;
        }
        while (low < high) {
            int mid = (high - low) / 2 + low;
            Pair pair = pairs.get(mid);
            if (pair.compareTo(target) <= 0) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}