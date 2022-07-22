package OtherProblems.LeetCodeProblems.InCompleted;

import java.util.Arrays;

public class KthIndexPosition {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int ans = kthPosition(nums, k);
        System.out.println(ans);
    }

    static int kthPosition(int nums[], int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    static int kthIndexPosition(int nums[], int k) {
        if (nums.length == 0) return 0;

        int ans = 0;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = nums.length-1; i > 0 ; i--) {
            if (nums[i] == k){
                ans = nums[k];
            }
        }

        if (ans > 0) return ans;
        else return -1;
    }
}
