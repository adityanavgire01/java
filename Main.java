import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an integer: ");

        int num = Integer.parseInt(reader.readLine());

        System.out.println("Entered num : " + num);
    }
}