package ss1_java_overview.student_management;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    double score;

    // tạo contructor
    public Student(){

    }

    
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }




    
    // voet ham tinh tong

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao id: ");
        id = Integer.parseInt(input.nextLine());

        System.out.println("Nhap vao ten: ");
        name = input.nextLine();

        System.out.println("Nhap vao diem: ");
        score = Double.parseDouble(input.nextLine());
    }
    void output() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);

    }





}
