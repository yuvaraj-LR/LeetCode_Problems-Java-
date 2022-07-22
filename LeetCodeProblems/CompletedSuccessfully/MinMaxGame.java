package OtherProblems.LeetCodeProblems.CompletedSuccessfully;

public class MinMaxGame {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 8, 2, 2};
        int ans = minMaxGame(arr);
        System.out.println(ans);
    }

    static int minMaxGame(int[] nums) {
        int n = nums.length;

        while (n > 1) {
            n /= 2;
            for (int i = 0; i < nums.length; i++) {
                if (n%2 == 0) {
                    nums[i] = Math.min(nums[i / 2] , nums[i/2 + 1]);
                } else {
                    nums[i] = Math.max(nums[i / 2], nums[i/2 + 1 ]);
                }
            }
        }

        return nums[0];
    }
}
