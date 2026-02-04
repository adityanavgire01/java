public class pat7 {
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        // Print the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}