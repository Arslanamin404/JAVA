package Week_04;

import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[3];
        Scanner user_input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter %d elements: ", arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = user_input.nextInt();
            }
            System.out.println();
        }
        user_input.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
