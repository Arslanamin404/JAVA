// Create a two dimensional array, read its elements from the keyboard and display the array in the form of a matrix.
package Week_04;

import java.util.Scanner;

public class Two_D_array {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int rows = 3, cols = 2;
        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.printf("Enter %d elements for ROW %d: \n", cols, i + 1);
            for (int j = 0; j < cols; j++) {
                arr[i][j] = userInput.nextInt();
            }
            System.err.println();
        }

        for (int i = 0; i < rows; i++) {
            System.out.printf("ROW %d: \n", i + 1);
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }
        userInput.close();
    }
}
