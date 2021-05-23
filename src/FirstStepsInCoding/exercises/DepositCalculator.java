package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Проччитане на вход
        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        // Изчисления
        // сумата за един месец = ((депозирана сума * годишен лихвен процент ) / 12)
        double sumPerMonth = depositSum * (interestRate / 100) / 12;
        // сума = депозирана сума  + срок на депозита * сумата за един месец
        double totalSum = depositSum + months * sumPerMonth;

        // Принтиране на резултата
        System.out.println(totalSum);
    }
}
