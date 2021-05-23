package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int chefs = Integer.parseInt(scanner.nextLine());
        int cakesNum = Integer.parseInt(scanner.nextLine());
        int wafflesNum = Integer.parseInt(scanner.nextLine());
        int pancakesNum = Integer.parseInt(scanner.nextLine());

        double cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;

        // Обща сума за един ден от всички сладкари
        double sumPerDay = (cakePrice * cakesNum + wafflePrice * wafflesNum
                + pancakePrice * pancakesNum) * chefs;

        // Сума събрана от цялата кампания
        double totalSum = sumPerDay * days;

        // Сума след покриване на разходите
        totalSum = totalSum - totalSum / 8;

        // Принтиране
        System.out.printf("%.2f", totalSum);
    }
}
