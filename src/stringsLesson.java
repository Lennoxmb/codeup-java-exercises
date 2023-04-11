import java.util.Scanner;

public class stringsLesson {
    public static void main(String[] args) {
//        String message = "Hello";
//        System.out.println(message.equalsIgnoreCase("Hello"));
//        System.out.println(message.startsWith("He"));
//        String password = "password";
//        System.out.println(password.length() > 8);
            String message2 = "this is my message ";
//            int position = message2.indexOf("is");
//        System.out.println(message2.toUpperCase());
        System.out.println(message2.trim());

        Scanner input = new Scanner(System.in);
        System.out.println("would you like to continue? [Y/N]");
        String userChoice = input.nextLine();
        System.out.println(userChoice.trim().equalsIgnoreCase("y"));







    }
}
