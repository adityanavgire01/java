import java.util.Arrays;
import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr1 = new int[row][col];

        for (int i = 0; i < row; i ++ ){
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int[] num : arr1) {
            System.out.println(Arrays.toString(num));
        }

        sc.close();
    }

}

