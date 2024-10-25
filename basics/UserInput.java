
//java is the package, util is its subPackage and Scanner is the class  
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // System.in means we are going to take input from keyboard(Standard Input
        // Device)
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = userInput.nextLine(); // nextLine() method is used to take string as input

        System.out.print("Enter Your AGE: ");
        int age = userInput.nextInt(); // nextInt() method is used to take int as input

        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);

        // Close the scanner to free up the resource
        userInput.close();
    }
}