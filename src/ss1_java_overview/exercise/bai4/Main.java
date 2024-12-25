package ss1_java_overview.exercise.bai4;

public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng phân số
        PhanSo phanSo1 = new PhanSo();
        phanSo1.xuat();
        System.out.println(phanSo1);
        PhanSo phanSo2 = new PhanSo(1, 2);

        phanSo2.xuat();
    }
}
