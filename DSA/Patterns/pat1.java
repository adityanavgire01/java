// rules - steps
// step 1 : run outer loop the number of rows are there
// step 2 : identify the no. of cols in each row -> how many cols, and types of ele in cols
// step 3 : what do you need to print - find formulae for rows and cols

// *****
// *****
// *****
// *****
// *****

// here rows = 5, cols in each row = 5, to be print = *

public class pat1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*" + " ");
            }
            System.err.println();
        }
    }
}
