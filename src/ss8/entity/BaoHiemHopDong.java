package ss8.entity;

import java.time.LocalDate;
import java.util.Scanner;


public class BaoHiemHopDong extends BaoHiem {

	private String sanPhamDiKem;
	private LocalDate thoiGianKetThuc;

	public BaoHiemHopDong() {
	}

	public BaoHiemHopDong(String tenBaoHiem, int thoiHanDong, double mucPhiDong,
												boolean cachThucDong, LocalDate thoiGianBatDau,
												String sanPhamDiKem, LocalDate thoiGianKetThuc) {
		super(tenBaoHiem, thoiHanDong, mucPhiDong, cachThucDong, thoiGianBatDau);
		this.sanPhamDiKem = sanPhamDiKem;
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	/**
	 * @return the san pham di kem
	 */
	public String getSanPhamDiKem() {
		return sanPhamDiKem;
	}

	/**
	 * Set the san pham di kem.
	 *
	 * @param sanPhamDiKem the san pham di kem to set
	 */
	public void setSanPhamDiKem(String sanPhamDiKem) {
		this.sanPhamDiKem = sanPhamDiKem;
	}

/**
 * Gets the thoi gian ket thuc.
 *
 * @return the thoi gian ket thuc
 */
	public LocalDate getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	/**
	 * Set the thoi gian ket thuc.
	 *
	 * @param thoiGianKetThuc the thoi gian ket thuc to set
	 */
	public void setThoiGianKetThuc(LocalDate thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}


	/**
	 * Input the {@link BaoHiemHopDong} from console.
	 * <p>
	 * This method will ask user to input the {@link #getTenBaoHiem() ten bao hiem},
	 * {@link #getThoiHanDong() thoi han dong}, {@link #getMucPhiDong() muc phi dong},
	 * {@link #isCachThucDong() cach thuc dong}, {@link #getThoiGianBatDau() thoi gian
	 * bat dau}, {@link #getSanPhamDiKem() san pham di kem} and {@link #getThoiGianKetThuc()
	 * thoi gian ket thuc}.
	 */
	public void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();

		System.out.println("nhap san pham di kem");
		sanPhamDiKem = scanner.nextLine();
		System.out.println("nhap thoi gian ket thuc");
		thoiGianKetThuc = LocalDate.parse(scanner.nextLine());
	}

	/**
	 * Outputs the details of the {@link BaoHiemHopDong} to the console.
	 * <p>
	 * This method prints the {@link #getSanPhamDiKem() san pham di kem}
	 * and {@link #getThoiGianKetThuc() thoi gian ket thuc}
	 * along with the output from the superclass.
	 */
	public void output() {
		super.output();
		System.out.println("san pham di kem : " + sanPhamDiKem);
		System.out.println("thoi gian ket thuc : " + thoiGianKetThuc);
	}
}
