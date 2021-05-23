import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        // priceShip трябва да е double
        int priceShip = 0;
        switch (season) {
            case "Spring":
                priceShip = 3000;
                if (fishers % 2 == 0) {
                    priceShip *= 0.95;
                }
                break;
            case "Summer":
                priceShip = 4200;
                if (fishers % 2 == 0) {
                    priceShip *= 0.95;
                }
                break;
            case "Autumn":
                priceShip = 4200;
                break;
            case "Winter":
                priceShip = 2600;
                if (fishers % 2 == 0) {
                    priceShip *= 0.95;
                }
                break;
        }

        if (fishers <= 6) {
            priceShip *= 0.90;
        } else if (fishers <= 11) {
            priceShip *= 0.85;
        } else {
            priceShip *= 0.75;
        }

        double moneyLeft = 0;
        if (budget >= priceShip) {
            moneyLeft = budget - priceShip;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        }
        if (budget < priceShip) {
            moneyLeft = priceShip - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
        }
    }
}
