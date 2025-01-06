package ss4.exercise.entity;

import java.util.Scanner;

public class OldPhone extends Phone implements Discountable {
	private int bateryStatus;
	private String description;

	@Override
	public double calculateTotalPrice() {
		return getPrice();
	}

	public OldPhone() {
	}

	public OldPhone(String id, String name, Double price, int warranty, String manufacturer, int bateryStatus, String description) {
		super(id, name, price, warranty, manufacturer);
		this.bateryStatus = bateryStatus;
		this.description = description;
	}


	public int getBateryStatus() {
		return bateryStatus;
	}

	public void setBateryStatus(int bateryStatus) {
		this.bateryStatus = bateryStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao trang thai pin : ");
		bateryStatus = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap vao mo ta : ");
		description = scanner.nextLine();
	}

	@Override
	public void applyDiscountToOldPhones(double percentDiscount) {
		double discount = getPrice() * (1 - percentDiscount / 100.0);
		setPrice(discount);
	}
}



