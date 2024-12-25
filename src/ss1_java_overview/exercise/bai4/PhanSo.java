package ss1_java_overview.exercise.bai4;


public class PhanSo {
    private int tuSo; // Tử số của phân số
    private int mauSo; // Mẫu số của phân số

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tuSo) {
        this.tuSo = tuSo;
        mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon(); // Rút gọn phân số ngay sau khi khởi tạo
    }

    private void rutGon() {
        int ucln = uocChungLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }
    // Tìm ước chung lớn nhất
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

    public void xuat() {
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    public PhanSo copy() {
        return new PhanSo(tuSo, mauSo);
    }

    // Phương thức cộng với một số
    public void cong(int value) {
        tuSo += value * mauSo;
        rutGon();
    }

}
