package ss8.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class BaoHiemSinhKy extends BaoHiem{

	private LocalDate thoiGianTroCap;
	private LocalDate thoiGianBatDau;
	private  LocalDate thoiGianKetThuc;

	public BaoHiemSinhKy() {
	}

	public BaoHiemSinhKy(String tenBaoHiem, int thoiHanDong, double mucPhiDong,
											 boolean cachThucDong, LocalDate thoiGianBatDau, LocalDate thoiGianTroCap, LocalDate thoiGianBatDau1, LocalDate thoiGianKetThuc) {
		super(tenBaoHiem, thoiHanDong, mucPhiDong, cachThucDong, thoiGianBatDau);
		this.thoiGianTroCap = thoiGianTroCap;
		this.thoiGianBatDau = thoiGianBatDau1;
		this.thoiGianKetThuc = thoiGianKetThuc;
	}



	/**
	 * Gets the thoiGianTroCap.
	 *
	 * @return the thoiGianTroCap
	 */
	public LocalDate getThoiGianTroCap() {
		return thoiGianTroCap;
	}


/**
 * Sets the thoiGianTroCap.
 *
 * @param thoiGianTroCap the thoiGianTroCap to set
 */
	public void setThoiGianTroCap(LocalDate thoiGianTroCap) {
		this.thoiGianTroCap = thoiGianTroCap;
	}


	/**
	 * Gets the thoiGianBatDau.
	 * <p>
	 * This method returns the {@link #thoiGianBatDau} of this object.
	 *
	 * @return the thoiGianBatDau
	 */
	@Override
	public LocalDate getThoiGianBatDau() {
		return thoiGianBatDau;
	}


	/**
	 * Sets the thoiGianBatDau.
	 * <p>
	 * This method sets the {@link #thoiGianBatDau} of this object.
	 *
	 * @param thoiGianBatDau the thoiGianBatDau to set
	 */
	@Override
	public void setThoiGianBatDau(LocalDate thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}


	/**
	 * Gets the thoiGianKetThuc.
	 *
	 * @return the thoiGianKetThuc
	 */
	public LocalDate getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}


/**
 * Sets the thoiGianKetThuc.
 *
 * @param thoiGianKetThuc the thoiGianKetThuc to set
 */
	public void setThoiGianKetThuc(LocalDate thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}


	/**
	 * Input the {@link BaoHiemSinhKy} from console.
	 * <p>
	 * This method will ask user to input the {@link #getTenBaoHiem() ten bao hiem},
	 * {@link #getThoiHanDong() thoi han dong}, {@link #getMucPhiDong() muc phi dong},
	 * {@link #isCachThucDong() cach thuc dong}, {@link #getThoiGianBatDau() thoi gian
	 * bat dau}, {@link #getThoiGianTroCap() thoi gian tro cap} and {@link #getThoiGianKetThuc()
	 * thoi gian ket thuc}.
	 */
	public void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();
		System.out.println("nhap thoi gian tro cap");
		thoiGianTroCap = LocalDate.parse(scanner.nextLine());
		System.out.println("nhap thoi gian ket thuc");
		thoiGianKetThuc = LocalDate.parse(scanner.nextLine());
	}

	/**
	 * Outputs the details of the {@link BaoHiemSinhKy} to the console.
	 * <p>
	 * This method prints the {@link #getThoiGianTroCap() thoi gian tro cap}
	 * and {@link #getThoiGianKetThuc() thoi gian ket thuc}
	 * along with the output from the superclass.
	 */
	public void output() {
		super.output();
		System.out.println("thoi gian tro cap : " + thoiGianTroCap);
		System.out.println("thoi gian ket thuc : " + thoiGianKetThuc);
	}
}
