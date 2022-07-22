package OtherProblems.LeetCodeProblems.CompletedSuccessfully;

public class FindThePivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int ans = findThePivotIndex(nums);
        System.out.println(ans);
    }

    static int findThePivotIndex(int[] nums) {
        if (nums.length == 0) return 0;

        int leftToMid = 0;
        int rightToMid = nums.length-1;

        for (int mid = 0; mid < nums.length; mid++) {
            int leftSum = 0, rightSum = 0;
            for (int i = leftToMid; i < mid; i++) {
                leftSum += nums[i];
            }

            for (int i = rightToMid; i > mid; i--) {
                rightSum += nums[i];
            }

            if (leftSum == rightSum) return mid;
        }

        return -1;


    }

}
