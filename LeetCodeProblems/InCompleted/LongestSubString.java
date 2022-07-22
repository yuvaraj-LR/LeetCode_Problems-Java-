package OtherProblems.LeetCodeProblems.InCompleted;

//This problem is incomplete.


//Given a string s, find the length of the longest substring without repeating characters.
//
//
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.


import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "bbb";
        int ans = longestSubString(s);
        System.out.println(ans);
    }

    static int longestSubString(String s) {
        HashSet<Character> l=new HashSet();
        int i=0,j=0,m=0;
        while(i<s.length())
        {
            if(!l.contains(s.charAt(i)))
            {
                l.add(s.charAt(i));
                i++;
                m=Math.max(l.size(),m);
            }
            else
            {
                l.remove(s.charAt(j));
                j++;
            }
        }
        return m;
    }

}
