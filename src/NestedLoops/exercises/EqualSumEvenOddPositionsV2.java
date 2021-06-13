package NestedLoops.exercises;

import java.util.Scanner;

public class EqualSumEvenOddPositionsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            String currentNumber = String.valueOf(i);
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNumber.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(currentNumber.charAt(j)));
                if ((j + 1) % 2 == 0){
                    evenSum += digit;
                }else {
                    oddSum += digit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
