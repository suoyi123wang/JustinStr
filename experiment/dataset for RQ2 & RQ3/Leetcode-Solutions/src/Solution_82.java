import java.util.*;
// for title: minimum-number-of-frogs-croaking
public class Solution_82 {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int length = croakOfFrogs.length();
        if (length % 5 != 0) {
            return -1;
        }
        int curSize = 0, maxSize = 0;
        int[] counts = new int[4];
        for (int i = 0; i < length; i++) {
            char c = croakOfFrogs.charAt(i);
            int index = getIndex(c);
            if (index == 0) {
                counts[index]++;
                curSize++;
                maxSize = Math.max(maxSize, curSize);
            } else {
                counts[index - 1]--;
                if (counts[index - 1] < 0) {
                    return -1;
                }
                if (index < 4) {
                    counts[index]++;
                } else {
                    curSize--;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            if (counts[i] != 0) {
                return -1;
            }
        }
        return maxSize;
    }

    public int getIndex(char c) {
        switch (c) {
        case 'c':
            return 0;
        case 'r':
            return 1;
        case 'o':
            return 2;
        case 'a':
            return 3;
        case 'k':
            return 4;
        default:
            return -1;
        }
    }
}
