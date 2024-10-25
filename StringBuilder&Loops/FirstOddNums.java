// Write a program in java to display first n odd numbers (Read n from the keyboard)

import java.util.Scanner;

public class FirstOddNums {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = userInput.nextInt();
        int count = 0;
        int i = 1;
        while (count < n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        userInput.close();
    }
}
