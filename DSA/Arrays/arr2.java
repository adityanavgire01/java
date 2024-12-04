import java.util.Arrays; // Importing the Arrays class to use its utility methods

public class arr2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5}; // Initializing an array with 5 elements
        System.out.println(Arrays.toString(nums)); // Printing the original array
        change(nums); // Changing the first element of the array
        System.out.println(Arrays.toString(nums)); // Printing the modified array
    }
    
    static void change(int[] arr) {
        arr[0] = 100; // Modifying the first element of the array to 100
    }
}

