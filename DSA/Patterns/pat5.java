// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

// divide the above pattern in two - increasing and decreasing

public class pat5 {
    public static void main(String[] args) {
        // increasing part
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // decreasing part
        for (int i = 0; i < 4; i++) {
            for (int j = 0 ; j < 4 - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
    }
}
