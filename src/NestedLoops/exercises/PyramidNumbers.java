package NestedLoops.exercises;

import java.util.Scanner;

public class PyramidNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;
        boolean isGreaterThanN = false;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;
                if (num > n){
                    isGreaterThanN = true;
                    break;
                }
            }
            if (isGreaterThanN){
                break;
            }
            System.out.println();
        }
    }
}
