// way to solve
// 1. Naive -> temp array in reverse order and again pasting it to original array O(n) Time and Space
// 2. Preferred -> 2 pointer method -> 
// 3.

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,6,7,33,88};

        System.out.println("Original array : " + Arrays.toString(arr));

        swap(arr);

        System.out.println("Reversed array : " + Arrays.toString(arr));

    }

    public static void swap(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
    }
}