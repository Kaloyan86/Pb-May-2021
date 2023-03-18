package ExamPrep18March2023;

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggagePriceAbove20kg = Double.parseDouble(scanner.nextLine());
        double luggageWeight = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());

        double luggagePrice = 0;

        if (luggageWeight < 10) {
            luggagePrice = luggagePriceAbove20kg * 0.20;
        } else if (luggageWeight <= 20) {
            luggagePrice = luggagePriceAbove20kg * 0.50;
        } else {
            luggagePrice = luggagePriceAbove20kg;
        }

        if (days < 7) {
            luggagePrice = luggagePrice * 1.40;
        } else if (days <= 30) {
            luggagePrice = luggagePrice * 1.15;
        } else {
            luggagePrice = luggagePrice * 1.10;
        }

        System.out.printf("The total price of bags is: %.2f lv.", luggagePrice * luggageCount );

    }
}
