import java.util.*;
// for title: zuma-game
public class Solution_200 {
    public int findMinStep(String board, String hand) {
        char[] arr = hand.toCharArray();
        Arrays.sort(arr);
        hand = new String(arr);

        // 初始化用队列维护的状态队列：其中的三个元素分别为桌面球状态、手中球状态和回合数
        Queue<State> queue = new ArrayDeque<State>();
        queue.offer(new State(board, hand, 0));

        // 初始化用哈希集合维护的已访问过的状态
        Set<String> visited = new HashSet<String>();
        visited.add(board + " " + hand);

        while (!queue.isEmpty()) {
            State state = queue.poll();
            String curBoard = state.board;
            String curHand = state.hand;
            int step = state.step;
            for (int i = 0; i <= curBoard.length(); ++i) {
                for (int j = 0; j < curHand.length(); ++j) {
                    // 第 1 个剪枝条件: 当前球的颜色和上一个球的颜色相同
                    if (j > 0 && curHand.charAt(j) == curHand.charAt(j - 1)) {
                        continue;
                    }

                    // 第 2 个剪枝条件: 只在连续相同颜色的球的开头位置插入新球
                    if (i > 0 && curBoard.charAt(i - 1) == curHand.charAt(j)) {
                        continue;
                    }

                    // 第 3 个剪枝条件: 只在以下两种情况放置新球
                    boolean choose = false;
                    //  - 第 1 种情况 : 当前球颜色与后面的球的颜色相同
                    if (i < curBoard.length() && curBoard.charAt(i) == curHand.charAt(j)) {
                        choose = true;
                    }
                    //  - 第 2 种情况 : 当前后颜色相同且与当前颜色不同时候放置球
                    if (i > 0 && i < curBoard.length() && curBoard.charAt(i - 1) == curBoard.charAt(i) && curBoard.charAt(i - 1) != curHand.charAt(j)) {
                        choose = true;
                    }

                    if (choose) {
                        String newBoard = clean(curBoard.substring(0, i) + curHand.charAt(j) + curBoard.substring(i));
                        String newHand = curHand.substring(0, j) + curHand.substring(j + 1);
                        if (newBoard.length() == 0) {
                            return step + 1;
                        }
                        String str = newBoard + " " + newHand;
                        if (visited.add(str)) {
                            queue.offer(new State(newBoard, newHand, step + 1));
                        }
                    }
                }
            }
        }
        return -1;
    }

    public String clean(String s) {
        StringBuffer sb = new StringBuffer();
        Deque<Character> letterStack = new ArrayDeque<Character>();
        Deque<Integer> countStack = new ArrayDeque<Integer>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            while (!letterStack.isEmpty() && c != letterStack.peek() && countStack.peek() >= 3) {
                letterStack.pop();
                countStack.pop();
            }
            if (letterStack.isEmpty() || c != letterStack.peek()) {
                letterStack.push(c);
                countStack.push(1);
            } else {
                countStack.push(countStack.pop() + 1);
            }
        }
        if (!countStack.isEmpty() && countStack.peek() >= 3) {
            letterStack.pop();
            countStack.pop();
        }
        while (!letterStack.isEmpty()) {
            char letter = letterStack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; ++i) {
                sb.append(letter);
            }
        }
        sb.reverse();
        return sb.toString();
    }
}
 class State {
    String board;
    String hand;
    int step;

    public State(String board, String hand, int step) {
        this.board = board;
        this.hand = hand;
        this.step = step;
    }
}