import java.util.Scanner;;

public class Factorial {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = userInput.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);

        userInput.close();
    }
}
