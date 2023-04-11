import java.util.Scanner;

public class ControlStatementsLoopsLecture {
    public static void main(String[] args) {
        // ================================== boolean expressions
        // > >= < <= == !=
        double discountPercentage = 2.3;
//        System.out.println(discountPercentage == 2.0);

        //===================================== logical operators
        // && || & | !
//        System.out.println(discountPercentage > 3 || discountPercentage == 2.3);

        //========================================= string comparisons
//        String name = "Lennox";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("continue? [Y/N]");
//        String userInput = sc.next();
//        boolean confirmation = userInput.equalsIgnoreCase("y");
//        System.out.println(confirmation);


        // =================================== control structures
        //if , else if , else
        if (discountPercentage > 2) {
//            System.out.println("Discount Percentage is greater than 2");
        }

        // switch
//        int caseSwitch = 1;
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("case 1");
//                break;
//            case 2:
//                System.out.println("case 2");
//                break;
//            default:
//                System.out.println("default Case");
//        }

        // while loop
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

        // do while loop
//        do {
//            System.out.println("i is " + i);
//            i++;
//        } while (i < 10);

        // for loops
//        for(int i = 0; i < 10; i++){
//            System.out.println("i is " + i);
//        }

        //break and continue .... continue skips that iteration and continues.
        for(int i = 0; i < 10; i++){
            System.out.println("i is " + i);
            if(i == 5){
                break;
            }
        }



    }
}
