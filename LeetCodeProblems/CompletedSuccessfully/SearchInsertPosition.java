package OtherProblems.LeetCodeProblems.CompletedSuccessfully;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        int target = 5;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans = i;
                System.out.println(ans);
            }

            else if (nums[i] < target){
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}
