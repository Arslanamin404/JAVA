// Display the largest element of the array.

package Week_04;

public class Largest_InArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 13, 22, 3, 4, 5, 23, 43, 54 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element in array is: " + max);
    }
}
