import java.util.*;
// for title: design-add-and-search-words-data-structure
public class Solution_244 {
    private Trie4 root;

    public Solution_244() {
        root = new Trie4();
    }

    public void addWord(String word) {
        root.insert(word);
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, Trie4 node) {
        if (index == word.length()) {
            return node.isEnd();
        }
        char ch = word.charAt(index);
        if (Character.isLetter(ch)) {
            int childIndex = ch - 'a';
            Trie4 child = node.getChildren()[childIndex];
            if (child != null && dfs(word, index + 1, child)) {
                return true;
            }
        } else {
            for (int i = 0; i < 26; i++) {
                Trie4 child = node.getChildren()[i];
                if (child != null && dfs(word, index + 1, child)) {
                    return true;
                }
            }
        }
        return false;
    }
}

class Trie4 {
    private Trie4[] children;
    private boolean isEnd;

    public Trie4() {
        children = new Trie4[26];
        isEnd = false;
    }

    public void insert(String word) {
        Trie4 node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie4();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public Trie4[] getChildren() {
        return children;
    }

    public boolean isEnd() {
        return isEnd;
    }
}