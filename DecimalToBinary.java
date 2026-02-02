public class DecimalToBinary {

    // Array method
    static void convert1(int n) {

        int[] binaryArr = new int[1000];

        int i = 0;
        while (n > 0) {
            binaryArr[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryArr[j]);
        }
    }

    // Bitwise method
    static void convert2(int n) {

    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Decimal : " + n);
        System.out.print("Binary : ");
        convert1(n);

    }
}