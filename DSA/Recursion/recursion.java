


public class recursion {
    public static void main(String[] args) {
        printNum(1);
        
    }
    static void printNum(int n){
        System.out.println(n);
        printNum2(2);
    }
    static void printNum2(int n){
        System.out.println(n);
        printNum3(3);

    }
    static void printNum3(int n){
        System.out.println(n);
    }
}