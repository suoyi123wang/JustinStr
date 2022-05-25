import java.util.*;
// for title: design-underground-system
public class Solution_88 {
    public class Start {
        String station;
        int time;

        public Start(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    public class StartEnd {
        String start;
        String end;

        public StartEnd(String start, String end) {
            this.start = start;
            this.end = end;
        }

        public int hashCode() {
            return (start + end).hashCode();
        }

        public boolean equals(Object obj2) {
            if (obj2 instanceof StartEnd) {
                StartEnd startEnd2 = (StartEnd) obj2;
                return this.start.equals(startEnd2.start) && this.end.equals(startEnd2.end);
            }
            return false;
        }
    }

    public class SumAmount {
        int sum;
        int amount;

        public SumAmount(int sum, int amount) {
            this.sum = sum;
            this.amount = amount;
        }
    }

    Map<Integer, Start> startInfo;
    Map<StartEnd, SumAmount> table;

    public Solution_88() {
        startInfo = new HashMap<Integer, Start>();
        table = new HashMap<StartEnd, SumAmount>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        startInfo.put(id, new Start(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Start start = startInfo.get(id);
        String startStation = start.station;
        int startTime = start.time;
        StartEnd startEnd = new StartEnd(startStation, stationName);
        SumAmount sumAmount = table.getOrDefault(startEnd, new SumAmount(0, 0));
        sumAmount.sum += t - startTime;
        sumAmount.amount++;
        table.put(startEnd, sumAmount);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        StartEnd index = new StartEnd(startStation, endStation);
        SumAmount sumAmount = table.get(index);
        int sum = sumAmount.sum, amount = sumAmount.amount;
        return 1.0 * sum / amount;
    }
}