public class PalindromeNumRecursion {

    public static int reverseNumber(int num, int reversed) {
        if (num == 0){
            return reversed;
        } else {
            return reverseNumber(num / 10, reversed * 10 + (num % 10));
        }
    }
    
    public static boolean isPlindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)){
            return false;
        }
        return num == reverseNumber(num, 0);
    }
    public static void main(String[] args) {
        
        int num = 1441;
        boolean isNumPali = isPlindrome(num);
        System.out.println(isNumPali);

    }
}