public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,44,5,88,-1,445};
        int target = 44;

        int ans = linearSearchMethod(arr, target);
        System.out.println(ans);
    }

    static int linearSearchMethod(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
    
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
            }
        }
        return -1;
    }
}
