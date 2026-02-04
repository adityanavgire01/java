public class pat9 {
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        // Print the pattern
        for (int i = 0; i < n; i++) {
            // Print spaces to center the stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = 2 * (n - i) - 1; k > 0; k--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}