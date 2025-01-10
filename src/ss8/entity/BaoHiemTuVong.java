package ss8.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class BaoHiemTuVong extends BaoHiem{
	private String truongHopDongBaoHiem;
	private int thoiGianToiThieu;

	public BaoHiemTuVong() {
	}

	public BaoHiemTuVong(String tenBaoHiem, int thoiHanDong, double mucPhiDong,
											 boolean cachThucDong, LocalDate thoiGianBatDau, String truongHopDongBaoHiem, int thoiGianToiThieu) {
		super(tenBaoHiem, thoiHanDong, mucPhiDong, cachThucDong, thoiGianBatDau);
		this.truongHopDongBaoHiem = truongHopDongBaoHiem;
		this.thoiGianToiThieu = thoiGianToiThieu;
	}



	/**
	 * @return the truongHopDongBaoHiem
	 */
	public String isTruongHopDongBaoHiem() {
		return truongHopDongBaoHiem;
	}


    /**
     * Sets the truong hop dong bao hiem.
     *
     * @param truongHopDongBaoHiem the truong hop dong bao hiem to set
     */
	public void setTruongHopDongBaoHiem(String truongHopDongBaoHiem) {
		this.truongHopDongBaoHiem = truongHopDongBaoHiem;
	}


	/**
	 * Gets the thoi gian toi thieu.
	 *
	 * @return the thoi gian toi thieu
	 */
	public int getThoiGianToiThieu() {
		return thoiGianToiThieu;
	}



	/**
	 * Sets the thoi gian toi thieu.
	 *
	 * @param thoiGianToiThieu the thoi gian toi thieu to set
	 */
	public void setThoiGianToiThieu(int thoiGianToiThieu) {
		this.thoiGianToiThieu = thoiGianToiThieu;
	}


	/**
	 * Input the {@link BaoHiemTuVong} from console.
	 * <p>
	 * This method will ask user to input the {@link #getTenBaoHiem() ten bao hiem},
	 * {@link #getThoiHanDong() thoi han dong}, {@link #getMucPhiDong() muc phi dong},
	 * {@link #isCachThucDong() cach thuc dong}, {@link #getThoiGianBatDau() thoi gian bat dau},
	 * {@link #isTruongHopDongBaoHiem() truong hop dong bao hiem} and
	 * {@link #getThoiGianToiThieu() thoi gian toi thieu}.
	 */
	public void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();
		System.out.println("nhap truong hop dong bao hiem true");
		truongHopDongBaoHiem = scanner.nextLine();
		System.out.println("nhap thoi gian toi thieu");
		thoiGianToiThieu = Integer.parseInt(scanner.nextLine());
	}


	/**
	 * Prints the {@link BaoHiemTuVong} to console.
	 * <p>
	 * This method will call the {@link #output()} method of the {@link BaoHiem} and
	 * then print the {@link #isTruongHopDongBaoHiem() truong hop dong bao hiem} to the console.
	 */
	public void output() {
		super.output();
		System.out.println("truong hop dong bao hiem : " + truongHopDongBaoHiem);

	}
}
