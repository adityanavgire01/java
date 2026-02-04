import java.util.Arrays;

public class check {
    
    static void ReverseArray(int[] arr) {

        int n = arr.length;

        int[] temp = new int[n];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[n-i-1];
        }
        for (int j = 0; j < temp.length; j++) {
            arr[j] = temp[j];
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println("Original Array: " + Arrays.toString(arr));

        ReverseArray(arr);

        System.out.println("Reversed Array :  " + Arrays.toString(arr));

    }
}