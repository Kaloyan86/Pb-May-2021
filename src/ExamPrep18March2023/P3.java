package ExamPrep18March2023;

import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double moviePrice = 0;
        //  ("normal", "luxury" или "ultra luxury")
        switch (hallType) {
            case "normal":
                //  ("A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite")
                switch (movieName) {
                    case "A Star Is Born":
                        moviePrice = 7.50;
                        break;
                    case "Bohemian Rhapsody":
                        moviePrice = 7.35;
                        break;
                    case "Green Book":
                        moviePrice = 8.15;
                        break;
                    case "The Favourite":
                        moviePrice = 8.75;
                        break;
                }

                break;
            case "luxury":
                switch (movieName) {
                    case "A Star Is Born":
                        moviePrice = 10.50;
                        break;
                    case "Bohemian Rhapsody":
                        moviePrice = 9.45;
                        break;
                    case "Green Book":
                        moviePrice = 10.25;
                        break;
                    case "The Favourite":
                        moviePrice = 11.55;
                        break;
                }
                break;
            case "ultra luxury":
                switch (movieName) {
                    case "A Star Is Born":
                        moviePrice = 13.50;
                        break;
                    case "Bohemian Rhapsody":
                        moviePrice = 12.75;
                        break;
                    case "Green Book":
                        moviePrice = 13.25;
                        break;
                    case "The Favourite":
                        moviePrice = 13.95;
                        break;
                }
                break;
        }

        System.out.printf("%s -> %.2f lv.", movieName, moviePrice * tickets);

    }
}
