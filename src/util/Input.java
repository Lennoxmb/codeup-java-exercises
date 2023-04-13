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

    public boolean yesNo() {
        System.out.println("Would you like to continue? [y/N]");
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userNum = scanner.nextInt();
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        return getInt(min, max);
    }

    public int getInt(){
        System.out.println("enter a number"); //can do "prompt" too
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.printf("enter a number between %.1f and %.1f", min, max);
        double userInput = scanner.nextDouble();
        double userNum = scanner.nextDouble();
        if (userNum >= min && userNum <= max){
            return userNum;
        }
        return getDouble(min, max);
    }
    public double getDouble(){
        System.out.println("enter a number decimals");
        return scanner.nextDouble();
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



//The class should have the following methods, all of which return command line input from the user:
//
//String getString()
//boolean yesNo()
//int getInt(int min, int max)
//int getInt()
//double getDouble(double min, double max)
//double getDouble()
//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//Create another class named InputTest that has a static main method that uses all the methods from the Input class.