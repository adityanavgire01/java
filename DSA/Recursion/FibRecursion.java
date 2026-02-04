public class FibRecursion {
    public static void main(String[] args) {
        //  0 , 1, 1, 2, 3, 5, 8, 13, 21
        // fib(n) = fib(n-1) + fib(n-2);
        int result = fibNum(7);
        System.out.println(result);

    }
    public static int fibNum(int num) {

        // base case
        if(num == 0 || num == 1){
            return num;
        }
        
        return fibNum(num - 1) + fibNum( num - 2);
    }
}