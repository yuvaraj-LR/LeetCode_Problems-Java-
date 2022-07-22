package OtherProblems.LeetCodeProblems.CompletedSuccessfully;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}};

        int target = 11;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target)
                    System.out.println(matrix[i][j]);
            }
        }

    }
}
