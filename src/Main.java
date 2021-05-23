
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 100;
       // price *= 0.67;
        price = price - price * 0.33;
        System.out.println(price);
    }
}
