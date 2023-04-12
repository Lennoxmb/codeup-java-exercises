import java.util.Scanner;
import java.util.Arrays;


public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(2, 4));
//        System.out.println(getInteger(5, 10));
//        int userInput = getInteger(1, 10);
//        int factorial = factorial(userInput);
//        System.out.println(factorial);

        rollDice();

    }

    public static int addition(int x, int y) {
        return (x + y);
    }

    public static int subtraction(int x, int y) {
        return (x - y);
    }

    public static int multiply(int x, int y) {
        return (x * y);
    }

    public static int divide(int x, int y) {
        return (x / y);
    }

    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max);
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < min || number > max) {
            System.out.print("You're dumb. Between " + min + " and" + max);
            return number;
        }
        System.out.println(number);
        getInteger(min, max);
        return number;
    }

    public static int factorial(int num) {
        int userInput = getInteger(1, 10);
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result*=i;


        }
        return result;
    }



    public static void rollDice() {
        Scanner sc = new Scanner(System.in);

        boolean rollAgain = true;
        while (rollAgain) {
            System.out.println("How many dice would you like to roll?");
            int numDice = sc.nextInt();

            System.out.println("How many sides do they have?");
            int sides = sc.nextInt();
            System.out.println("You want to roll " + numDice + " D" + sides + "? [y/N]");
            Scanner rollss = new Scanner(System.in);
            String userChoice = rollss.nextLine();
            if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
                int total = 0;
                int[] rolls = new int[numDice];
                for (int i = 0; i < numDice; i++) {
                    int roll = (int) Math.floor(Math.random() * sides) + 1;
                    rolls[i] = roll;
                    total += roll;
                }
                System.out.println("Dice rolls: " + Arrays.toString(rolls));
                System.out.println("Total: " + total);

                System.out.println("Would you like to roll the dice again? [y/N]");
                String answer = sc.next();
                rollAgain = answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
            }
        }
    }

}
