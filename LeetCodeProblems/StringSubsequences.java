package OtherProblems.LeetCodeProblems;

import java.util.Arrays;

public class StringSubsequences {
    public static void main(String[] args) {
        String s = "abc";
        String d = "abcfd";

        char[] str1 = stringToArray(s);
        char[] str2 = stringToArray(d);
    }
    static char[] stringToArray(String s) {
        char[] str = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            str[i] = 0;
        }
        return str;
    }
}
