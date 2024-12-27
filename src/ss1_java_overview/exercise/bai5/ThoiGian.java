package ss1_java_overview.exercise.bai5;

public class ThoiGian {
    private int gio;    // Giờ
    private int phut;   // Phút
    private int giay;   // Giây

    // Constructor Mặc định: Khởi tạo thời gian 00:00:00.
    public ThoiGian() {
        gio = 0;
        phut = 0;
        giay = 0;
    }

    public ThoiGian(int gio) {
        this.gio = gio;
        phut = 0;
        giay = 0;
    }

    public ThoiGian(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
        giay = 0;
    }

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public ThoiGian(ThoiGian other) {
        this.gio = other.gio;
        this.phut = other.phut;
        this.giay = other.giay;
    }


    public void xuat(){
        System.out.println(gio + ":" + phut + ":" + giay);
    }
}
