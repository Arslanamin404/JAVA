import java.util.Scanner;

public class OneDArray {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);

        // size for array
        System.out.print("Size of Array: ");
        int size = userInput.nextInt();

        // defining array with size
        int arr[] = new int[size];

        // taking input from keyboard for array
        for (int i = 0; i < size; i++) {
            arr[i] = userInput.nextInt();
        }

        // printing array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        userInput.close();
    }
}
