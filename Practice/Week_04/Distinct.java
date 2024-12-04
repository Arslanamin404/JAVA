//Display the distinct elements of the array.
package Week_04;

public class Distinct {
    public static void main(String args[]) {
        int arr[] = new int[] { 11, 32, 11, 32, 11, 12, 12, 32, 1 };
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.err.print(arr[i] + " ");
            }
        }
    }
}
