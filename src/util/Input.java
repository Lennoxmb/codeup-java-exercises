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


