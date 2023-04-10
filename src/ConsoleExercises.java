import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        int userInputInteger = scanner.nextInt();
//        System.out.println(userInputInteger);

//        Scanner threeWords = new Scanner(System.in);
//        System.out.println("three words");
//        String wordOne = threeWords.next();
//        String wordTwo = threeWords.next();
//        String wordThree = threeWords.next();
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);
//
        Scanner roomSize = new Scanner(System.in);
        roomSize.useDelimiter("\n");
        System.out.println("How many feet wide is the room?");
        int roomWidth = roomSize.nextInt();
        System.out.println("How many feet Long the room?");
        int roomLength = roomSize.nextInt();
        System.out.printf("%s, %n%s%n", roomWidth, roomLength);
        System.out.println("The area is " + (roomWidth * roomLength));
        System.out.println("The perimeter is " + ((roomWidth * roomWidth) + (roomLength * roomLength)));

//### Bonus exercises -- from Justin Reich
//
//        1. Prompt the user to enter a favorite quote
//        - output the quote
//        - ask them to enter how many words are in the quote
//        - output the number they entered
//        - output if the number they entered indeed matched the number of words
//
//        2. Prompt the user to enter a list of top three favorite foods separated by only spaces
//
//        - Use the printf() to output the three top foods with the format:
//        1. FirstFood
//        2. SecondFood
//        3. ThirdFood
//
//        3. Prompt the user to enter a grocery list of three items
//                - each item should only be separated by a comma (no spaces)
//        - you will need to use the .useDelimiter() method on your scanner object
//                - output the result as a comma-separated list using printf()

        Scanner quote = new Scanner(System.in);
        System.out.println("What is your favorite Quote?");
        String favQuote = quote.nextLine();
        System.out.println(favQuote);
        System.out.println("How many words are in that quote?");
        int quoteWords = quote.nextInt();
        System.out.println(quoteWords);

        Scanner Foods = new Scanner(System.in);
        System.out.println("What are your top three favorite foods? (separated by spaces)");
        String wordOne = Foods.next();
        String wordTwo = Foods.next();
        String wordThree = Foods.next();
        System.out.println("1. " + wordOne);
        System.out.println("2. " + wordTwo);
        System.out.println("3. " + wordThree);


    }
}
