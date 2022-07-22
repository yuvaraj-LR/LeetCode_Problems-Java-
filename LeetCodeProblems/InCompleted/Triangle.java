package OtherProblems.LeetCodeProblems.InCompleted;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[][] triangle = {{2}, {3,4}, {6,5,7}, {4,1,8,3}};
        ArrayList<ArrayList<Integer>> tri = new ArrayList<>();

        //int ans = minimumTotal(tri);
        //System.out.println(ans);

//        int ans = minTotal(triangle);
//        System.out.println(ans);
    }

    static int minimumTotal(ArrayList<Integer> triangle) {
        int n = triangle.size();

        if (n == 0) return 0;

        int total = triangle.get(1);
        for (int i = 1; i <= n; i++) {
            int num = 0;
            num = Math.min(triangle.get(i), num);
            total += num;
        }
        return total;
    }

    static int minTotal(int[][] triangle) {
        int total = 0;
        for (int i = 0; i < triangle.length; i++) {
            int num = triangle[i][0];
            for(int j = 0; j < triangle[i].length; j++) {
                num = Math.min(triangle[i][j] , num);
            }
            total += num;
        }

        return total;
    }
}
