import java.util.Scanner;

public class scannerPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hi, what's your name?");
//        String userName = scanner.next();
//        System.out.println("Hello, " + userName);
//        System.out.println("What's your full name?");
//        String nextLine = scanner.nextLine();
//        String fullName = scanner.nextLine();
//        System.out.println("Say something else:");
//        String nextSentence = scanner.nextLine();
//        System.out.println(nextSentence);
//        System.out.println("Hi, " + fullName);

        System.out.println("Please enter an integer: ");
        String userInputInteger = scanner.nextLine();
        System.out.println(userInputInteger + userInputInteger);
        System.out.println("Your integer was: " + Integer.parseInt(userInputInteger));
        int parsedUserInput = Integer.parseInt(userInputInteger);
        System.out.println(parsedUserInput + parsedUserInput);


        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}
