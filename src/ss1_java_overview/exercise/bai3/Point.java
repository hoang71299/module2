package ss1_java_overview.exercise.bai3;

import java.util.Scanner;

public class Point {
    private double x ;
    private double y ;


    public void nhapDiem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x : ");
        x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap y : ");
        y = Integer.parseInt(scanner.nextLine());
    }
    public double tinhKhoangCach(Point point){
        double toadox = Math.pow(x - point.x,2);
        double toadoy = Math.pow(y - point.y,2);
        return Math.sqrt(toadox + toadoy);
    }
}
