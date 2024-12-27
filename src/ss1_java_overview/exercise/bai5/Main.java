package ss1_java_overview.exercise.bai5;

public class Main {
    public static void main(String[] args) {
        ThoiGian t1 = new ThoiGian();
        t1.xuat();

        ThoiGian t2 = new ThoiGian(2);
        t2.xuat();

        ThoiGian t3 = new ThoiGian(3, 4);
        t3.xuat();

        ThoiGian t4 = new ThoiGian(5, 6, 7);
        t4.xuat();

        ThoiGian t5 = new ThoiGian(t4);
        t5.xuat();

    }
}
