import java.util.Scanner;
import java.text.DecimalFormat;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create a DecimalFormat object for formatting results
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            // Prompt the user to enter the first number
            System.out.println("Enter the first number: ");
            double num1 = sc.nextDouble();

            // Prompt the user to enter the second number
            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();

            // Prompt the user to enter the operator
            System.out.println("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            // Perform the calculation based on the operator
            switch (operator) {
                case '+':
                    System.out.println("Result: " + df.format(num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + df.format(num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + df.format(num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + df.format(num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            }
        } catch (Exception e) {
            // Handle invalid inputs
            System.out.println("Error: Invalid input. Please enter numeric values for numbers.");
        } finally {
            // Close the Scanner
            sc.close();
        }
    }
}
    