package ss8.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Customer {
	private String hoTen;
	private LocalDate ngaySinh;
	private String diaChi;
	private String cmnd;
	private BaoHiem baoHiem;
	
	public Customer() {
	}



	public Customer(String hoTen, LocalDate ngaySinh, String diaChi, String cmnd) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.cmnd = cmnd;
	}



	/**
	 * Gets the ho ten.
	 *
	 * @return the ho ten
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * Sets the ho ten.
	 *
	 * @param hoTen the ho ten to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * Gets the ngay sinh.
	 *
	 * @return the ngay sinh as LocalDate
	 */
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	/**
	 * Sets the ngay sinh.
	 *
	 * @param ngaySinh the ngay sinh to set as LocalDate
	 */
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	/**
	 * Gets the dia chi.
	 *
	 * @return the dia chi
	 */
	public String getDiaChi() {
		return diaChi;
	}

	/**
	 * Sets the dia chi.
	 *
	 * @param diaChi the dia chi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

    /**
     * Gets the CMND (Chứng minh nhân dân).
     *
     * @return the CMND as a String
     */
	public String getCmnd() {
		return cmnd;
	}

	/**
	 * Sets the CMND (Chứng minh nhân dân) for the customer.
	 *
	 * @param cmnd the CMND to set as a String
	 */
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	/**
	 * Gets the BaoHiem (insurance) that the customer is covered by.
	 *
	 * @return the BaoHiem as an instance of {@link BaoHiem}
	 */
	public BaoHiem getBaoHiem() {
		return baoHiem;
	}

	/**
	 * Sets the BaoHiem (insurance) for the customer.
	 *
	 * @param baoHiem the BaoHiem instance to set
	 */
	public void setBaoHiem(BaoHiem baoHiem) {
		this.baoHiem = baoHiem;
	}

	/**
	 * Reads the customer's details from the console and sets the fields of the current object.
	 * <p>
	 * This method asks the user to input the customer's {@link #getHoTen() full name},
	 * {@link #getNgaySinh() date of birth}, {@link #getDiaChi() address},
	 * and {@link #getCmnd() CMND (Chứng minh nhân dân)}.
	 */
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ho ten");
		hoTen = scanner.nextLine();
		System.out.println("nhap ngay sinh");
		ngaySinh = LocalDate.parse(scanner.nextLine());
		System.out.println("nhap dia chi");
		diaChi = scanner.nextLine();
		System.out.println("nhap cmnd");
		cmnd = scanner.nextLine();

	}
	/**
	 * Outputs the customer's details to the console.
	 * <p>
	 * This method prints out the customer's full name, date of birth, address, CMND, and the
	 * details of the BaoHiem (insurance) they are covered by.
	 */
	public void output(){

		System.out.println("Ho ten: " + hoTen);
		System.out.println("Ngay sinh: " + ngaySinh);
		System.out.println("Dia chi: " + diaChi);
		System.out.println("CMND: " + cmnd);
		System.out.println("Bao hiem: " + baoHiem);

	}

}
