public class MinNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -5};
        System.out.println(minNum(arr));
    }

    static int minNum(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
    
}
