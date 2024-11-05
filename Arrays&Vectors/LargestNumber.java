// Display the largest element of the array.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Size of Array: ");
        int size = userInput.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = userInput.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Largest Number is: " + max);

        userInput.close();
    }
}