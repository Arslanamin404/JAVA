public class ListPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime Numbers of form 7n+6: ");
        findPrimesOfForm(7, 6);

        System.out.println("\n\nPrime Numbers of form 6n+5: ");
        findPrimesOfForm(6, 5);

        System.out.println("\n\nPrime Numbers of form 11n+5: ");
        findPrimesOfForm(11, 5);
        System.out.println("\n\nPrime Numbers of form 71n+41: ");
        findPrimesOfForm(71, 41);
    }

    public static void findPrimesOfForm(int multiplier, int constant) {
        int count = 0, n = 0;
        while (count < 10) {
            int num = (multiplier * n) + constant;
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            n++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}