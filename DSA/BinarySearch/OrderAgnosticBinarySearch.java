public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 61, 444, 888, 1000};
        int target = 888;

        int result = binarySearch(arr, target);
        System.out.println(result != -1 ? "Target found at index " + result : "Target not found");
    }

    static boolean isAscendingOrder(int[] arr) {
        return arr[0] <= arr[arr.length - 1];
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = isAscendingOrder(arr);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}