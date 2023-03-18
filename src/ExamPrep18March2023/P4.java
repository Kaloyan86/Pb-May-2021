package ExamPrep18March2023;

import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double neededMoney = 0;
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (name) {
                case "Thrones":
                    //•	Thrones – 50%
                    price = price * 0.50;
                    break;
                case "Lucifer":
                    //•	Lucifer – 40%
                    price = price * 0.60;
                    break;
                case "Protector":
                    //•	Protector – 30%
                    price = price * 0.70;
                    break;
                case "TotalDrama":
                    //•	TotalDrama – 20%
                    price = price * 0.80;
                    break;
                case "Area":
                    //•	Area – 10%
                    price = price * 0.90;
                    break;
            }
            neededMoney += price;

        }

        if (budget >= neededMoney) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - neededMoney);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", neededMoney - budget);
        }

    }
}
