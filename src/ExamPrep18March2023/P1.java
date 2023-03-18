package ExamPrep18March2023;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tennisRacketPrice = Double.parseDouble(scanner.nextLine());
        int tennisRackets = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());

        double racketsTotalPrice = tennisRacketPrice * tennisRackets;
        double sneakersPrice = tennisRacketPrice / 6;
        double sneakersTotalPrice = sneakers * sneakersPrice;
        double otherEquipment = (racketsTotalPrice + sneakersTotalPrice) * 0.20;

        double totalPrice = racketsTotalPrice + sneakersTotalPrice + otherEquipment;
        double djokovichPrice = Math.floor(totalPrice / 8);
        double sponsorsPrice = Math.ceil(totalPrice * 7 / 8);

        System.out.printf("Price to be paid by Djokovic %.0f\n", djokovichPrice);
        System.out.printf("Price to be paid by sponsors %.0f", sponsorsPrice);

    }
}
