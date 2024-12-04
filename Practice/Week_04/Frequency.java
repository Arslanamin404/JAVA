package Week_04;

public class Frequency {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 1, 1, 4, 5, 4, 2, 3, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Integer.MIN_VALUE) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = Integer.MIN_VALUE;
                }
            }
            System.out.printf("%d occurred %d times.\n", arr[i], count);
        }
    }
}