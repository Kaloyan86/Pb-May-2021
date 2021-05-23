package CondittionalStatementsAdvanced.exercises;

import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double discount = 1;
        // В зависимост от броя си групата ползва отстъпка:
        if (fishers <= 6) {
            discount = 0.90;
        } else if (fishers <= 11) {
            discount = 0.85;
        } else {
            discount = 0.75;
        }
        double boatRent = 0;
        // switch case -> season
        switch (season) {
            case "Spring":
                boatRent = 3000 * discount;
                break;
            case "Summer":
            case "Autumn":
                boatRent = 4200 * discount;
                break;
            case "Winter":
                boatRent = 2600 * discount;
                break;
        }

        // 5% отстъпка ако са четен брой освен ако не е есен
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            boatRent *= 0.95;
        }

        String output = "";
        if (budget >= boatRent) {
           output = String.format("Yes! You have %.2f leva left.", budget - boatRent);
        } else {
            output = String.format("Not enough money! You need %.2f leva.", boatRent - budget);
        }
        System.out.println(output);
    }
}
