package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        double usd = Double.parseDouble(scanner.nextLine());
        // Изчисления
        double bgn = usd * 1.79549;
        // Принтиране на резултата
        System.out.print(bgn);
    }
}
