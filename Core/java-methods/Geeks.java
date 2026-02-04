public class Geeks {

    public void printMessage() {
        System.out.println("Inside of method");
    }

    public static void showNum(int num1) {
        System.out.println("Num: " + num1);
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks();
        obj.printMessage();

        Geeks.showNum(10);
    }

}