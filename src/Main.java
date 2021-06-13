import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Имаме n-състезатели
        int n = Integer.parseInt(scanner.nextLine());
        // Всеки състезател започва да стреля до получаване на команда "end"
        // всеки изтрел репрезентира броя точки които е уцелил

        // 2
        // Kaloyan
        // 10
        // 15
        // 5
        // end
        // Peter
        // 5
        // 6
        // end
        for (int i = 0; i < n; i++) {
            int currentPlayerPoints = 0;
            String currentPlayerName = scanner.nextLine();
            String input = scanner.nextLine();
            while (!input.equals("end")) {
                int points = Integer.parseInt(input);
                currentPlayerPoints += points;
                input = scanner.nextLine();
            }
            System.out.printf("Player: %s has %d points%n",currentPlayerName,currentPlayerPoints);
        }
    }
}
