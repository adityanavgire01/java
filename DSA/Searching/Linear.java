public class Linear {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;

        int ans = LinearSearch(arr, target); // return index
        boolean ans2 = LinearSearch2(arr, target); // return true or false
        int ans3 = LinearSearch3(arr, target); // return element

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);



    }
    static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    static boolean LinearSearch2(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    static int LinearSearch3(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }

}