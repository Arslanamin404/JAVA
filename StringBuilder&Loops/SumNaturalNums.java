// Write a Program in java to find the sum of first n Natural numbers.

import java.util.Scanner;

public class SumNaturalNums {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = userInput.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        userInput.close();
    }
}