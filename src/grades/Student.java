package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for(int grade : this.grades){
            total += grade;
        }
        return total / grades.size();

//        if (this.grades.size() == 0) {
//            return 0;
//        }
//        int sum = 0;
//        for (int grade : this.grades) {
//            sum += grade;
//        }
//        return (double) sum / this.grades.size();


    }
//    public void addGrades(ArrayList)
}
