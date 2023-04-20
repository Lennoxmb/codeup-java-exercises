package grades;

import grades.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Jacob");
        student1.addGrade(95);
        student1.addGrade(100);
        student1.addGrade(50);
        Student student2 = new Student("Codey");
        student2.addGrade(60);
        student2.addGrade(95);
        student2.addGrade(70);
        Student student3 = new Student("Patrick");
        student3.addGrade(75);
        System.out.printf("Student %s has a grade of %s.", student2.getName(), student2.getGradeAverage());
    }
}
