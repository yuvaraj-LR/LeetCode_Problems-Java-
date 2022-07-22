package OtherProblems.LeetCodeProblems.InCompleted;

import java.util.Arrays;

//Error Occur in this program. Answer excepted -> E Bt it returns T :(

public class HighestNoOfCharInString {
    public static void main(String[] args) {
        String s = "lEeTcOdE";
        char[] str = makeStringInAsc(s.toLowerCase());
        String ans = highestNoOfCharInString(str);
        System.out.println(ans);
    }

    static String highestNoOfCharInString(char[] s) {
        if (s.length == 0) return "";

        //if (s.length() == 0) return "";

        String a = "";
        int temp = 0;

        for (int i = 0; i < s.length; i++) {
            int count = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[i] == s[j]) count++;
            }

            if (count > temp) a = String.valueOf(s[i]);
        }

        return a.toUpperCase();
    }


    static char[] makeStringInAsc(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return arr;
    }
}

