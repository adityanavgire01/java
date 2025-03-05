public class pat10 {
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        // Print the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars with spaces between them
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}