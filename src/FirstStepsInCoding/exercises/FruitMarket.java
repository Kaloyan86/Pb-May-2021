package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        // цената на малините е с 50% по-ниска от тази на ягодите;
        double raspberriesPrice = strawberriesPrice * 0.5;

        // цената на портокалите е с 40% по-ниска от цената на малините;
        double orangesPrice = raspberriesPrice * 0.6;

        // цената на бананите е с 80% по-ниска от цената на малините.
        double bananasPrice = raspberriesPrice * 0.2;

        // Обща сума
        double totalSum = raspberriesPrice * raspberriesKg
                + orangesPrice * orangesKg
                + bananasPrice * bananasKg
                + strawberriesPrice * strawberriesKg;


        System.out.printf("%.2f", totalSum);
    }
}
