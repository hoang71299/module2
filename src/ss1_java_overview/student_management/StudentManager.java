package ss1_java_overview.student_management;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();
        s1.output();
        Student s2 = new Student(); // đối tượng và bieens đóii tuượng
        s2.input();
        s2.output();
        Student s3 = new Student(12,"Toan", 9.0);
        s3.output();

        System.out.println();



        


        
    }
}
