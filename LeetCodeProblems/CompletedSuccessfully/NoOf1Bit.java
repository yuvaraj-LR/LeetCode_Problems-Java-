package OtherProblems.LeetCodeProblems.CompletedSuccessfully;

public class NoOf1Bit {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;

        String num = Integer.toBinaryString(n);
        char target = '1';
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == target) {
                count ++;
            }
        }
        System.out.println(count);

//        int count = 0;
//        while (n!=0){
//            int temp = n % 10;
//            if (temp == 1)
//                count+=1;
//            n/=10;
//        }
//        System.out.println(count);
    }
}
