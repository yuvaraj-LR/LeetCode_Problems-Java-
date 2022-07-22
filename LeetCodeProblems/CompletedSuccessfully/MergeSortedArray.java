package OtherProblems.LeetCodeProblems.CompletedSuccessfully;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2, 5, 6};
        int n = 3;
        int[] ans = mergeSortedArray(num1, m, num2, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSortedArray(int[] num1, int m, int[] num2, int n)  {
        //ArrayList<Integer> ans = new ArrayList<>();
        int[] ans = new int[m + n];
        if (m >= 0) System.arraycopy(num1, 0, ans, 0, m);
        if (n >= 0) System.arraycopy(num2, 0, ans, n, n);
        Arrays.sort(ans);
        return ans;
    }
}
