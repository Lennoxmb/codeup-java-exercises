package grades;

import java.util.*;

public class GradesApplication {

    public static void outputStudentInfo(String userInput, HashMap<String, Student> students){
        if (students.containsKey(userInput)){
            Student student = students.get(userInput);
            System.out.printf("Name: %s, Github Username: %s%nCurrent Average: %.1f%n", student.getName(), userInput, student.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the Github username of \"%s\"%n", userInput);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student Jacob = new Student("Jacob");
        Jacob.addGrades(new ArrayList<>(List.of(75, 85, 95)));
        Student Codey = new Student("Codey");
        Codey.addGrades(new ArrayList<>(List.of(100, 78, 84)));
        Student mateo = new Student("Patrick");
        mateo.addGrades(new ArrayList<>(List.of(94, 68, 90)));
        Student Cal = new Student("Cal");
        Cal.addGrades(new ArrayList<>(List.of(79, 84, 89)));

        students.put("JacobGithub", Jacob);
        students.put("CodingCodey", Codey);
        students.put("AnotherCodepun", mateo);
        students.put("CALMaster", Cal);

        Set<String> gitHubUserNames = students.keySet();
        for (String gitHubUserName : gitHubUserNames){
            System.out.printf("|%s| ", gitHubUserName);
        }
        System.out.println("");
        System.out.println("What student would you like to see more information on?");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        outputStudentInfo(userInput, students);
        while (true){
            System.out.println("Would you like to see another student? (yes/no)");
            System.out.println("");
            String userChoice = sc.nextLine().toLowerCase();
            if (userChoice.equals("no") || userChoice.equals("n")){
                System.out.println("Goodbye, and have a wonderful day!");
                System.out.println("");
                break;
            } else {
                System.out.println("What student would you like to see  more information on?");
                System.out.println("");
                userInput = sc.nextLine();
                outputStudentInfo(userInput, students);
            }
        }
    }
}