public class Main {
    public static void main(String[] args) {
        int n1 = 9; // 1001
        int n2 = 7; // 0111

        // n1 & n2 = 0001
        // n1 | n2 = 1111
        // n1 ^ n2 = 1110
        // ~n1 = 0110 (2's complement)
        // right shift = 9 >> 1 =
        // left shift = 9 << 1 =
        // unsigned right >>>

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        System.out.println(~-4);

        System.out.println(n1 >> 1);
        System.out.println(n1 << 1);

        // int, byte, short, long are all considered as integer types
    }
}

// bitwise not - 2nd complement
// for integer data tyes - like int long short byte in java

// not 5 = -6
// not 3 = -4
// not 2 = -3
// not 0 = -1

// not -1 = 0
// not -2 = 1
// not -5 = 4

// so we can generalize it in formula as -> ~(x) = -(x + 1)
