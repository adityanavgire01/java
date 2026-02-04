public class patterns {
    public static void main(String[] args) {
        int num = 5;
        pattern5(num);
        
    }
    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // printing new line
            System.out.println();
        }
    }

    // pattern 3
    // ****
    // ***
    // **
    // *
    public static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n-row)+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    // patter 4
    // 1
    // 12
    // 123
    // 1234
    // 12345
    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");   
            }
            System.out.println();
        }
    }

    // pattern 5
    // *
    // **
    // ***
    // **
    // *
    public static void pattern5(int n) {
        
        for (int row = 1; row <= (2*n - 1); row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}