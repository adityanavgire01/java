


public class pat8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // print spaces to center the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print the stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
