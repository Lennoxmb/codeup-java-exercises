package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string:");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Do you want to continue?[y/n]");
        String userChoice = scanner.nextLine();
        return userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");
    }

    // use this yesNo method in combination
    // with getString(). Pass the return from a getString()
    // to this method
    public boolean yesNo(String input){
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        String userInput = getString();
        try {
            Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Not valid");
            return getInt(min, max);
        }
        int userNum = Integer.parseInt(userInput);
        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("You did not enter a correct number");
            return getInt(min, max);
        }
    }

    public int getInt() {
        System.out.println("Enter an integer:");
        String userInput = getString();
        try {
            Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("That's not a number");
            return getInt();

        } return Integer.parseInt(userInput);
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %.1f and %.1f:", min, max);
        String userInput = getString();
        try {
            Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Not valid");
            return getDouble(min, max);
        }
        Double userNum = Double.parseDouble(userInput);
        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("That wasn't in the correct numbers");

            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Enter a number (decimals allowed):");
        String userInput = getString();
        try {
            Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Not valid");
            return getDouble();
        } return getDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public void getGhost(){
        System.out.println("");
        String ghost = scanner.nextLine();
    }

}

//Your getInt and getDouble methods should make sure that the value returned from the method is actually an int or a double. You can do this by replacing the use of the Scanner nextInt() and nextDouble() methods with the existing getString() method you created in a previous exercise using the following methods to convert the returned String into the desired datatype:
//
//
//Integer.valueOf(String s);
//Double.valueOf(String s);