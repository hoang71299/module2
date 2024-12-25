package ss1_java_overview.exercise.bai3;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();
        System.out.println("Nhap diem 1 : ");
        point1.nhapDiem();
        System.out.println("Nhap diem 2 : ");
        point2.nhapDiem();
        System.out.println("Khoang cach giua 2 diem : " + point1.tinhKhoangCach(point2));
    }
}
