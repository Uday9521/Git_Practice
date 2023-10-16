package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution {


    public ArrayList<Integer> solve(ArrayList<String> A, ArrayList<String> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        createTries(A);
        for (String word : B) {
            ans.add(searchInTries(word) ? 1 : 0);
        }
        return ans;
    }

    Tries root = new Tries(' ');

    public void createTries(ArrayList<String> list) {
        for (String word : list) {
            Tries curr = root;
            for (int i = 0; i < word.length(); i++) {
                if (curr.childer[word.charAt(i) - 'a'] == null) {
                    curr.childer[word.charAt(i) - 'a'] = new Tries(word.charAt(i));
                }
                curr = curr.childer[word.charAt(i) - 'a'];
            }
            curr.eof = true;
        }
    }

    public boolean searchInTries(String word) {
        Tries curr = root;
        for (int i = 0; i < word.length(); i++) {
            if (curr.childer[word.charAt(i) - 'a'] == null) {
                return false;
            }
            curr = curr.childer[word.charAt(i) - 'a'];
        }
        return curr.eof;
    }

    public static class Tries {
        char val;
        boolean eof;
        Tries[] childer;

        public Tries(char val) {
            this.val = val;
            this.eof = false;
            this.childer = new Tries[26];
        }
    }

}
