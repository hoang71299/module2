package ss1_java_overview.exercise.bai2;


public class Main {
    public static void main(String[] args) {
        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();

        System.out.println("Nhập phân số thứ nhất:");
        phanSo1.nhap();
        System.out.println("Nhập phân số thứ hai:");
        phanSo2.nhap();
        System.out.println("Phân số thứ nhất:");
        phanSo1.xuat();
        System.out.println("Phân số thứ hai:");
        phanSo2.xuat();

        System.out.println("Hiệu hai phân số:");
        PhanSo hieu = phanSo1.tru(phanSo2);
//        hieu.xuat(); // Gọi phương thức xuất để hiển thị kết quả hiệu



    }
}
