/*
 * We know that The smallest positive integer that can be expressed as 
 todo: am+bn for all integers m and n is the GCD(a,b)
*/

public class LeastPositiveInteger {
    public static void main(String[] args) {
        System.err.print("-".repeat(50));

        System.err.print("\nLeast positive integer of form 7m+6: ");
        System.out.println(leastPositiveIntegerOfForm7nPlus6(7, 6));

        System.err.print("\nLeast positive integer of form 7m+6n: ");
        System.out.println(leastPositiveIntegerOfForm(7, 6));

        System.err.print("\nLeast positive integer of form 65m+13n: ");
        System.out.println(leastPositiveIntegerOfForm(65, 13));

        System.err.print("\nLeast positive integer of form 18m-42n+96u: ");
        System.out.println(leastPositiveIntegerOfForm(18, -42, 96));

        System.err.print("-".repeat(50));
    }

    public static int leastPositiveIntegerOfForm7nPlus6(int multiplier, int constant) {
        int n = 0;
        int result = multiplier * n + constant;
        return result;
    }

    public static int leastPositiveIntegerOfForm(int firstMultiplier, int secondMultiplier) {
        return Math.abs(gcd(firstMultiplier, secondMultiplier));
    }

    public static int leastPositiveIntegerOfForm(int firstMultiplier, int secondMultiplier, int thirdMultiplier) {
        return Math.abs(gcd(firstMultiplier, secondMultiplier, thirdMultiplier));
    }

    // let solve this problem using recursion (refer gcd image)
    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return Math.abs(b);
    }

    public static int gcd(int num1, int num2, int num3) {
        int gcdNum1Num2 = gcd(num1, num2);
        return gcd(gcdNum1Num2, num3);
    }

}
