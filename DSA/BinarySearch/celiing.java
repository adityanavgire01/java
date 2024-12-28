public class celiing {
    public static void main(String[] args) {
        int[] arr = {10, 22, 33, 44, 54, 65, 92};
        int target = 66;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

    static int Ceiling(int[] arr, int target) {

        // smallest num >= target
        // but if the greatest num in arr is smaller than the target then ->
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}
