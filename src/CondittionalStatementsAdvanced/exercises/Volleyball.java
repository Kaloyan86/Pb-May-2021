package CondittionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double volleyballTime = 0;
        // Игрите през weekends в София
        volleyballTime += (48 - h) * 3.0 / 4;

        // Игрите през празничните дни София
        volleyballTime += p * 2.0 / 3;

        // Игрите в родното симясто
        volleyballTime += h;

        if (year.equals("leap")){
                volleyballTime *= 1.15;
        }
        volleyballTime = Math.floor(volleyballTime);
        System.out.printf("%.0f",volleyballTime);


    }
}
