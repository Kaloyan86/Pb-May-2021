package ConditionalStatements.exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double statists = Double.parseDouble(scanner.nextLine());
        double clothePrice = Double.parseDouble(scanner.nextLine());

        // Декорът за филма е на стойност 10% от бюджета.
        double decor = budget * 0.1;

        // При повече от 150 статиста, има отстъпка за облеклото на стойност 10%.
        if (statists > 150) {
            clothePrice *= 0.9;
        }

        double neededMoney = decor + statists * clothePrice;

        if (neededMoney > budget) {
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva more.", neededMoney - budget);
        } else {
            System.out.printf("Action!\n" +
                    "Wingard starts filming with %.2f leva left.", budget - neededMoney);
        }
    }
}
