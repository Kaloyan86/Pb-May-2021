package ExamPrep.Exam6and7July2019;

import java.util.Locale;
import java.util.Scanner;

public class P6TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int maxPowerfulWord = 0;
        String mostPowerfulWord = "";
        while (!word.equals("End of words")) {
            int symbolsSum = 0;
            boolean isVowel = false;
            for (int i = 0; i < word.length(); i++) {
                int symbol = word.charAt(i);
                symbolsSum += symbol;
            }
            // 'a', 'e', 'i', 'o', 'u', 'y'
            char firstSymbol = word.toLowerCase().charAt(0);
            if (firstSymbol == 'a' ||
                    firstSymbol == 'e' ||
                    firstSymbol == 'i' ||
                    firstSymbol == 'o' ||
                    firstSymbol == 'u' ||
                    firstSymbol == 'y') {
                isVowel = true;
            }
            if (isVowel) {
                symbolsSum = symbolsSum * word.length();
            } else {
                symbolsSum = symbolsSum / word.length();
            }
            if (symbolsSum > maxPowerfulWord) {
                maxPowerfulWord = symbolsSum;
                mostPowerfulWord = word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", mostPowerfulWord, maxPowerfulWord);
    }
}
