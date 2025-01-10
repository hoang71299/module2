package ss8.entity;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class BaoHiem {

	private String tenGoiBaoHiem;
	private int thoiHanDong;
	private double mucPhiDong;
	private  boolean cachThucDong;
	private LocalDate thoiGianBatDau;




	public BaoHiem() {
	}

	public BaoHiem(String tenBaoHiem, int thoiHanDong, double mucPhiDong, boolean cachThucDong, LocalDate thoiGianBatDau) {
		this.tenGoiBaoHiem = tenBaoHiem;
		this.thoiHanDong = thoiHanDong;
		this.mucPhiDong = mucPhiDong;
		this.cachThucDong = cachThucDong;
		this.thoiGianBatDau = thoiGianBatDau;
	}


	/**
	 * Gets the ten goi bao hiem.
	 *
	 * @return the ten goi bao hiem
	 */
	public String getTenGoiBaoHiem() {
		return tenGoiBaoHiem;
	}

	/**
	 * Set the ten goi bao hiem.
	 *
	 * @param tenGoiBaoHiem the ten goi bao hiem to set
	 */
	public void setTenGoiBaoHiem(String tenGoiBaoHiem) {
		this.tenGoiBaoHiem = tenGoiBaoHiem;
	}

	/**
	 * Gets the thoi han dong.
	 *
	 * @return the thoi han dong
	 */
	public int getThoiHanDong() {
		return thoiHanDong;
	}

	/**
	 * Set the thoi han dong.
	 *
	 * @param thoiHanDong the thoi han dong to set
	 */
	public void setThoiHanDong(int thoiHanDong) {
		this.thoiHanDong = thoiHanDong;
	}

	public double getMucPhiDong() {
		return mucPhiDong;
	}

	/**
	 * Set the muc phi dong.
	 *
	 * @param mucPhiDong the muc phi dong to set
	 */
	public void setMucPhiDong(double mucPhiDong) {
		this.mucPhiDong = mucPhiDong;
	}

	public boolean isCachThucDong() {
		return cachThucDong;
	}

	/**
	 * Set the cach thuc dong.
	 *
	 * @param cachThucDong the cach thuc dong to set
	 */
	public void setCachThucDong(boolean cachThucDong) {
		this.cachThucDong = cachThucDong;
	}

	public LocalDate getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	/**
	 * Set the thoi gian bat dau.
	 *
	 * @param thoiGianBatDau the thoi gian bat dau to set
	 */
	public void setThoiGianBatDau(LocalDate thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	/**
	 * Inputs the {@link BaoHiem} from console.
	 * <p>
	 * This method will ask user to input the {@link #getTenGoiBaoHiem() ten goi bao hiem},
	 * {@link #getThoiHanDong() thoi han dong}, {@link #getMucPhiDong() muc phi dong},
	 * {@link #isCachThucDong() cach thuc dong} and {@link #getThoiGianBatDau() thoi gian bat dau}.
	 */
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ten goi bao hiem");
		tenGoiBaoHiem = scanner.nextLine();
		System.out.println("nhap thoi han dong");
		thoiHanDong = Integer.parseInt(scanner.nextLine());
		System.out.println("nhap muc phi dong");
		mucPhiDong = Double.parseDouble(scanner.nextLine());
		System.out.println("nhap cach thuc dong");
		cachThucDong = Boolean.parseBoolean(scanner.nextLine());
		System.out.println("nhap thoi gian bat dau");
		thoiGianBatDau = LocalDate.parse(scanner.nextLine());
	}
	/**
	 * Outputs the details of the {@link BaoHiem} to the console.
	 * <p>
	 * This method prints the {@link #getTenGoiBaoHiem() ten goi bao hiem},
	 * {@link #getThoiHanDong() thoi han dong}, {@link #getMucPhiDong() muc phi dong}
	 * and {@link #isCachThucDong() cach thuc dong}.
	 */
	public void output() {
		System.out.println("ten bao hiem : " + tenGoiBaoHiem);
		System.out.println("thoi han dong : " + thoiHanDong);
		System.out.println("muc phi dong : " + mucPhiDong);
		System.out.println("cach thuc dong : " + cachThucDong);
	}
}
