package OtherProblems.LeetCodeProblems.CompletedSuccessfully;

public class AmountPaidInTax {
    public static void main(String[] args) {
        int[][] brackets = {{3,50},{7,10},{12,25}};
        int income = 10;
        double ans = amountPaidInTax(brackets, income);
        System.out.println(ans);
    }

    static double amountPaidInTax(int[][] brackets, int income){
        double pre = 0;
        double ret = 0;
        for(int i = 0;i < brackets.length;i++){
            ret += Math.max(0, (Math.min(income, brackets[i][0]) - pre)) * brackets[i][1] / 100.;
            pre = brackets[i][0];
        }
        return ret;
    }
}
