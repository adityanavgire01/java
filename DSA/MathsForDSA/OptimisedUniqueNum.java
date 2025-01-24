public class OptimisedUniqueNum {
    public static int findUniqueNum(int[] arr) {
        int result = 0;
        for (int num: arr) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4, 2, 5, 3, 4};
        int result = findUniqueNum(arr);
        // System.out.println(result);
        System.out.println(5^6);
    }
    
}
