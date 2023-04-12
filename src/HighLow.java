import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = (int) (Math.random() * 100) + 1;
            int guess;
            System.out.println("I'm thinking of a number between 1 and 100.");
            do {
                System.out.print("Enter your guess: ");
                while (!scanner.hasNextInt()) {
                    scanner.next();
                }
                guess = scanner.nextInt();

                if (guess == number) {
                    System.out.println("GOOD GUESS!");
                } else if (guess < number) {
                    System.out.println("HIGHER");
                } else {
                    System.out.println("LOWER");
                }
            } while (guess != number);

            scanner.close();
        }
    }
