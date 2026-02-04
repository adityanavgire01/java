//    *
//   **
//  ***
// ****

// num pf rows = 4, cols = each row spaces = row num +3 


public class pat6 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            // printing spaces
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
