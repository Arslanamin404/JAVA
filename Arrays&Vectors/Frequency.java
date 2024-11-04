// Display elements of the array a with number of occurrences of each element

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Size of Array: ");
        int size = userInput.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = userInput.nextInt();
        }


        userInput.close();
    }

}
