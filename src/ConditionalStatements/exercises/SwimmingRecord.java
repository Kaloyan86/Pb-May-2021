package ConditionalStatements.exercises;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        // На всеки 15 м. към времето му се добавят 12.5 сек.
        double lag = Math.floor(distance / 15) * 12.5;
        double ivanTime = timePerMeter * distance + lag;

        if (ivanTime < record) {
            System.out.printf("Yes, he succeeded! " +
                    "The new world record is %.2f seconds.", ivanTime);
        } else {
            System.out.printf("No, he failed! " +
                    "He was %.2f seconds slower.", ivanTime - record);
        }
    }
}
