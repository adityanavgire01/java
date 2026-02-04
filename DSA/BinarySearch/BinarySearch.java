
// Binary Seach - 6 dec 2024

// Binary Seach 
// the array must be sorted (ascending or descending)

// prcedure
// finc the middle element
// if target > element -> search in the right of arrray else search in left
// if middle element == taget -> ans


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 1, 10 , 12, 34, 56, 73, 100};
        int target = 0;

        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end-start)/2 ;


        // finding the middle element -> below is much efficient than simple (start+end)/2

        while (start <= end) {

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