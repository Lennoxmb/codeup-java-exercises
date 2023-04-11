import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // itrate all numbers from 1-15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 2;
//        do {
//            System.out.println("i is " + i);
//            i = i + 2;
//        } while (i <= 100);

//Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println("i is " + i);
//            i -= 5;
//        } while (i >= -10);


      //  Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long i = 2;
//        do {
//            System.out.println("i is " + i);
//            i = i * i;
//        } while (i < 1000000);

//        int i = 0;
//        while (i <= 100) {
//            System.out.println("i is " + i);
//            i++;
//        }


//for (int i = 1; i <= 100; i++) {
//    if (i % 15 == 0) {
//        System.out.println("FizzBuzz");
//    } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        String choice = "y";
//        while(choice.equalsIgnoreCase("y")) {
//            Scanner table = new Scanner(System.in);
//            System.out.println("Please enter an integer: ");
//            int input = table.nextInt();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 0; i <= input; i++) {
//                // can also do vars. int squared = i*i, int cubed = squared*i, then instead of the formula put in the vars.
//                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
//            }
//            System.out.println("continue? [Y/N]");
//            table.nextLine();
//            choice = table.nextLine();
//        }


        Scanner grade = new Scanner(System.in);
        System.out.println("Please enter a grade between 0 to 100:");
        int input = grade.nextInt();
            if (input >= 88) {
                System.out.println("grade is an A");
            } else if (input >= 80) {
                System.out.println("grade is an B");
            } else if (input >= 67) {
                System.out.println("grade is an C");
            } else if (input >= 60) {
                System.out.println("grade is an D");
            } else if (input >= 0) {
                System.out.println("grade is an F");
            }



    }
}
