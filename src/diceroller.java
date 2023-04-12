import java.util.Arrays;
import java.util.Scanner;

public class diceroller {
    public static void main(String[] args) {
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
