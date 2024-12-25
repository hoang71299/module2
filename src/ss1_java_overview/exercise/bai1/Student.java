package ss1_java_overview.exercise.bai1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Student {
    private String name;
    private Double mathScore;
    private Double literatureScore;


    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien : ");
        name = new Scanner(System.in).nextLine();

        System.out.println("Nhap diem toan :");
        mathScore = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap diem van :");
        literatureScore = Double.parseDouble(scanner.nextLine());

    }

    public void output(){

        System.out.println("Thong tin sinh vien : ");
        System.out.println("Ten sinh vien : " + name);
        System.out.println("Diem toan : " + mathScore);
        System.out.println("Diem van : " + literatureScore);
        System.out.println("Diem trung binh : "+ caculateAverageScore());
    }

    public double caculateAverageScore(){
        return (mathScore + literatureScore) / 2;
    }
}
