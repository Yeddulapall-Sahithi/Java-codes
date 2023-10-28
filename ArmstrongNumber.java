import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the entered number is an Armstrong number
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrongNumber(int num) {
        // Save the original number for comparison later
        int originalNumber = num;

        // Initialize sum to 0
        int sum = 0;

        // Find the number of digits in the given number
        int numberOfDigits = String.valueOf(num).length();

        // Calculate the sum of each digit raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }
}
