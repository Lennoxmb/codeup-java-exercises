package grades;

import java.util.*;

public class GradesApplication {


    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Jacob");
//        joe.addGrades(new ArrayList<>(List.of(95, 50, 30)));
        student1.addGrade(95);
        student1.addGrade(50);
        student1.addGrade(30);
        Student student2 = new Student("Codey");
        student2.addGrade(60);
        student2.addGrade(95);
        student2.addGrade(70);
        Student student3 = new Student("Patrick");
        student3.addGrade(75);
        student3.addGrade(95);
        student3.addGrade(50);
        Student student4 = new Student("Cal");
        student4.addGrade(75);
        student4.addGrade(10);
        student4.addGrade(50);

        students.put("JacobGithub", student1); //names after fix
        students.put("CodingCodey", student2);
        students.put("AnotherCodepun", student3);
        students.put("CALMaster", student4);


        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:" +
                "\n");
        Set<String> githubUsers = students.keySet();
        for (String username : githubUsers) {
            System.out.printf("|%s| ", username);
        }

        System.out.println("\nWhat student would you like to see more information on?\n");
            Scanner input = new Scanner(System.in);
            String inputUserName = input.nextLine();
            if (students.containsKey(inputUserName)) {
        System.out.printf("Username: %s%nName: %s%nGrade: %.1f", inputUserName, students.get(inputUserName).getName(), students.get(inputUserName).getGradeAverage());
            } else {
                System.out.printf("\"%s\" isn't a username\n", inputUserName);
            }



    }



}
