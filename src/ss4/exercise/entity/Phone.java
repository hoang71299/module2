package ss4.exercise.entity;


import java.util.Scanner;

public  abstract class  Phone implements Comparable<Phone> {
	private String id;
	private String name;
	private Double price;
	private int warranty;
	private String manufacturer;


	public abstract double calculateTotalPrice();
	public Phone() {

	}


	@Override
	public int compareTo(Phone o) {
		return Double.compare(this.getPrice(), o.getPrice());
	}

	public Phone(String id, String name, Double price, int warranty, String manufacturer) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.warranty = warranty;
		this.manufacturer = manufacturer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);


		System.out.println("Nhap vao ten : ");
		name = scanner.nextLine();
		System.out.println("Nhap vao gia : ");
		price = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhap vao thoi gian bao hanh : ");
		warranty = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap vao hang san xuat : ");
		manufacturer = scanner.nextLine();
	}

	public void output() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);

		System.out.println("Price : " + price);
		System.out.println("Warranty : " + warranty);
		System.out.println("Manufacturer : " + manufacturer);
	}


}
