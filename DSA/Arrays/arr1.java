import java.util.Arrays;
import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        System.out.println("Input " + arr.length + " elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}