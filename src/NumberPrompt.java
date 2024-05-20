import java.util.Scanner;

public class NumberPrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number < 100) {
                System.out.println("Try again. The number is less than 100.");
            }
        } while (number < 100);
        System.out.println("You entered " + number + ", which is greater than or equal to 100.");
        scanner.close();
    }
}
///User Input: Create a program that prompts the user to enter a number.
// If the number is less than 100,
// it should ask the user to try again. Keep asking until the user enters a number greater than or equal to 100.