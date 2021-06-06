package WhileLoop.exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int days = 0;
        while (moneyOnHand < excursionPrice) {
            // "spend" и "save"
            String command = scanner.nextLine();
            // Сумата, която ще спести/похарчи
            double money = Double.parseDouble(scanner.nextLine());
            days++;
            switch (command) {
                case "spend":
                    moneyOnHand -= money;
                    if (moneyOnHand < 0) {
                        moneyOnHand = 0;
                    }
                    spendDays++;
                    break;
                case "save":
                    moneyOnHand += money;
                    spendDays = 0;
                    break;
            }
            if (spendDays == 5) {
                break;
            }
        }
        if (moneyOnHand >= excursionPrice) {
            System.out.printf("You saved the money for %d days.", days);
        } else {
            System.out.printf("You can't save the money.\n" +
                    "%d\n", days);
        }
    }
}