package ConditionalStatements.exercises;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        // 10 m -> cm
        // input го превръщаме в метри
        if (input.equalsIgnoreCase("mm")){
            number = number / 1000;
        }else if (input.equalsIgnoreCase("cm")){
            number /= 100;
        }

        // input(в метри) -> output
        if (output.equalsIgnoreCase("mm")){
            number *= 1000;
        }else if (output.equalsIgnoreCase("cm")){
            number *= 100;
        }

        System.out.printf("%.3f",number);
    }
}
