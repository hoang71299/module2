package ss1_java_overview.exercise.bai2;

import java.util.Scanner;

public class PhanSo {

    private int tuSo;
    private int mauSo;


    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu so : ");
        tuSo = Integer.parseInt(scanner.nextLine());
        do{
            System.out.println("Nhap mau so : ");
            mauSo = Integer.parseInt(scanner.nextLine());
        }while (mauSo == 0);
    }

    private int uocChungLonNhat(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);

        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public void rutGon() {
        int ucln = uocChungLonNhat(tuSo, mauSo);
        tuSo = tuSo / ucln;
        mauSo = mauSo / ucln;
        if (mauSo < 0) {
            tuSo = tuSo * -1;
            mauSo = mauSo * -1;
        }
    }

    public void xuat() {

        rutGon();
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    PhanSo cong(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo + phanSoKhac.tuSo * this.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    PhanSo tru(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo - phanSoKhac.tuSo * this.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    PhanSo nhan(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.tuSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    PhanSo chia(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.tuSo;
        return ketQua;
    }


    public boolean laPhanSoDuong(){
        return tuSo > 0 && mauSo > 0;
    }

    public boolean laPhanSo0(){
        return tuSo == 0 ;
    }




}
