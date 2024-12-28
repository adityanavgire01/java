public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 11, 13, 15, 18, 20, 22, 24, 27, 29, 31, 33, 36, 38, 40, 42, 45, 47, 49, 51, 54, 56, 58, 60, 63, 65, 67, 69, 72, 74, 76, 78, 81, 83, 85, 87, 90, 92, 94, 96, 98, 100};
        int target = 31;

        int result = exponentialSearch(arr, target);
        System.out.println(result);
    }

    static int exponentialSearch(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            start = end + 1; 
            end = end * 2;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

      

        // finding the middle element -> above is much efficient than simple (start+end)/2

        while (start <= end) {

            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // ans found
            
                return mid;
            }
        }

        return -1;
    }
    
}
