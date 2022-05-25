import java.util.*;
// for title: implement-trie-prefix-tree
public class Solution_245 {
    private Solution_245[] children;
    private boolean isEnd;

    public Solution_245() {
        children = new Solution_245[26];
        isEnd = false;
    }
    
    public void insert(String word) {
        Solution_245 node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Solution_245();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }
    
    public boolean search(String word) {
        Solution_245 node = searchPrefix(word);
        return node != null && node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Solution_245 searchPrefix(String prefix) {
        Solution_245 node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}