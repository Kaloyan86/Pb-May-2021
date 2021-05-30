package ExamPrep.Exam15and16June2019;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double startingPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        boolean isNominated = false;
        for (int i = 0; i < n; i++) {
            String judgeName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            // дължината на името на оценяващия
            // умножено по точките, които дава делено на две.
            double judgePoints = judgeName.length() * points / 2;
            startingPoints += judgePoints;

            if (startingPoints > 1250.5) {
                isNominated = true;
                break;
            }
        }
        if (isNominated) {
            System.out.printf("Congratulations, %s got a nominee" +
                    " for leading role with %.1f!", actorName, startingPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - startingPoints);
        }
    }
}
