import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
            Scanner bob = new Scanner(System.in);
            String input = bob.nextLine();
            if (input.endsWith("?")) {
                System.out.println("Bob: Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (input.isBlank()) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }

        }

    }
}
