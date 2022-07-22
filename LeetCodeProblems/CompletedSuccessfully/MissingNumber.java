package OtherProblems.LeetCodeProblems.CompletedSuccessfully;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        System.out.println(missNum(nums));

        int[] number = new int[nums.length+1];
        number[0] = 0;
        int missingNum = 0;

        for (int i=1; i<=nums.length; i++){
            number[i] = i;
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (number[i] != nums[j]) {
                    missingNum = i;
                }
//                if (i > j) {
//                    if (number[i] != nums[j]) {
//                        missingNum = i;
//                    }
//                }
            }
        }

        //System.out.println(missingNum);

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] != number[j])
//                    continue;
//                    //System.out.print(i + " ");
//            }
//        }

    }

    private static int missNum(int[] nums) {
        int sumArr = 0;
        for(int i=0; i<nums.length; i++)
            sumArr += nums[i];
        int n = nums.length;
        int expSum = (n*(n+1))/2;
        int reqNum = expSum - sumArr;
        return reqNum;
    }
}
