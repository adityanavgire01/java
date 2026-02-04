// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/




public class findEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findEvenDigits(nums));

    }


    static int findEvenDigits(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)){
                count++;
            }
        }

        return count;

    }

    static boolean even(int num) {
        int count = digits(num);

        return count % 2 == 0;
         
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /=10;

        }
        return count;
    }
}
