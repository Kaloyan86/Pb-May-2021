
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGradesLimit = Integer.parseInt(scanner.nextLine());
        String problemName = scanner.nextLine();

        while (!problemName.equals("Enough")) {
            int problemNameNumber = Integer.parseInt(problemName);
            int grade = Integer.parseInt(scanner.nextLine());


            problemName = scanner.nextLine();
        }

    }

}
