package OtherProblems.LeetCodeProblems;

import java.util.Arrays;

public class ParticipateIntoDesiToBinary {
    public static void main(String[] args) {
        String str = "15321";
        System.out.println(Arrays.toString(minPartitions(str)));
    }

    public static char[] minPartitions(String str) {
        System.out.println(str.length());
        char[] ch = new char[str.length()];

        // Copying character by character into array
        // using for each loop
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        Arrays.sort(ch);
        System.out.println(ch[str.length()-1]);
        return ch;
    }
}
