public class Main {
    public static void main(String[] args) {
        var x = 3.99;
        var y = 3.99f;

        long numLong = 2098765456789876L;
        int num = 9089;

        Integer intNum = Integer.valueOf(255);

        System.out.println(((Object) num).getClass());
        System.out.println(((Object) intNum).getClass());

    }
}