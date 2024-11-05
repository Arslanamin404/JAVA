import java.util.Scanner;

public class RangePrimes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.err.print("Enter start range: ");
        int startRange = userInput.nextInt();
        
        System.err.print("Enter end range: ");
        int endRange = userInput.nextInt();

        primesInRange(startRange, endRange);

        userInput.close();
    }

    public static void primesInRange(int start, int end) {
        int count = 0;
        int originalStart = start;
        if (end >= start) {
            while (start <= end) {
                if (isPrime(start)) {
                    count++;
                    System.out.print(start + " ");
                }
                start++;
            }
            System.out.println("\nThere are " + count + " prime numbers between " + originalStart + " and " + end);
        } else {
            System.err.println("Please enter a valid range");
        }

    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
