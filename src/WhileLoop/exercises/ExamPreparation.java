package WhileLoop.exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());
        String problemName = scanner.nextLine();
        int poorGrades = 0;
        boolean isFailed = false;
        String lastProblem = "";
        int allProblems = 0;
        double totalScore = 0;
        while (!problemName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            totalScore += grade;
            allProblems++;
            lastProblem = problemName;
            if (grade <= 4) {
                poorGrades++;
                if (poorGradesLimit == poorGrades) {
                    isFailed = true;
                    break;
                }
            }
            problemName = scanner.nextLine();
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", poorGrades);
        } else {
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s\n", totalScore / allProblems, allProblems, lastProblem);
        }
    }
}
