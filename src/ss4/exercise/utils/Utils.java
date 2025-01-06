package ss4.exercise.utils;

import ss4.exercise.entity.NewPhone;
import ss4.exercise.entity.OldPhone;
import ss4.exercise.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

	static Scanner scanner = new Scanner(System.in);

	static ArrayList<Phone> phones = new ArrayList<>();


	static {
		phones.add(new OldPhone("DTC001", "Iphone 11", 3000000.0, 12, "Apple"
						, 100, "Da qua su dung"));
		phones.add(new OldPhone("DTC002", "Iphone 12", 2000000.0, 12, "Apple"
						, 100, "Da qua su dung"));
		phones.add(new NewPhone("DTM001", "Iphone 12", 5000000.0, 12,
						"Apple", 100));
		phones.add(new NewPhone("DTM002", "Iphone 12", 7000000.0, 12,
						"Apple", 100));
	}

	public static void menuList() {

		int choice;
		while (true) {
			do {
				System.out.println("=======================================");
				System.out.println("Danh sach dien thoai");
				System.out.println("1. Xem Tat Ca");
				System.out.println("2.Xem Dien Thoai Cu");
				System.out.println("3.Xem Dien Thoai Moi");
				System.out.println("4.Quay lai trang chủ");
				System.out.println("Vui lòng chon chuc nang ");
				choice = Integer.parseInt(scanner.nextLine());

				switch (choice) {
					case 1:
						for (int i = 0; i < phones.size(); i++) {
							System.out.println("Thong tin dien thoai  thứ " + (i + 1) + " : ");
							phones.get(i).output();
						}

						break;
					case 2:
						System.out.println("Danh sach dien thoai cu");
						int count = 1;
						for (Phone phone : phones) {
							if (phone instanceof OldPhone) {
								System.out.println("Thong tin dien thoai cu thu " + count++ + " : " + " : ");
								phone.output();
							}
						}
						break;

					case 3:
						count = 1;
						for (Phone phone : phones) {
							if (phone instanceof NewPhone) {
								System.out.println("Thong tin dien thoai moi thu " + count++ + " : ");
								phone.output();
							}
						}
						break;

					case 4:
						return;
					default:
						System.out.println("Lua chon khong hop le vui long chon lai");

				}
			} while (choice < 1 || choice > 4);

		}

	}

	public static void menuAdd() {
		int choice;
		while (true) {
			do {
				System.out.println("Themn moi dien thoai");
				System.out.println("1. Them dien thoai cu");
				System.out.println("2. Them dien thoai moi");
				System.out.println("3. Quay lai trang chủ");
				System.out.println("Moi ban chon chuc nang : ");
				choice = Integer.parseInt(scanner.nextLine());

				switch (choice) {
					case 1:
						OldPhone oldPhone = new OldPhone();
						oldPhone.input();
						oldPhone.setId(getIdOldPhone());
						phones.add(oldPhone);
						System.out.println("Them dien thoai cu thanh cong");
						break;
					case 2:
						NewPhone newPhone = new NewPhone();
						newPhone.input();
						newPhone.setId(getIdOldPhone());
						phones.add(newPhone);
						System.out.println("Them dien thoai moi thanh cong");
						break;
					case 3:
						return;
					default:
						System.out.println("Lua chon khong hop le vui long chon lai");
				}
			} while (choice < 1 || choice > 4);
		}
	}

	private static String getIdOldPhone() {
		ArrayList<OldPhone> oldPhones = getOldPhones();

		if (oldPhones.isEmpty()) {
			return "DTC001"; // Trả về ID mặc định nếu danh sách rỗng
		}

		int max = 0; // Khởi tạo max bằng 0
		for (OldPhone phone : oldPhones) {
			String id = phone.getId();
			if (id.startsWith("DTC") && id.length() >= 6) { // Kiểm tra định dạng ID
				int numId = Integer.parseInt(id.substring(3));
				if (max < numId) {
					max = numId;
				}
			}
		}

		return String.format("DTC%03d", max + 1); // Tăng ID và định dạng
	}

	private static ArrayList<OldPhone> getOldPhones() {
		ArrayList<OldPhone> oldPhones = new ArrayList<>();
		for (Phone phone : phones) {
			if (phone instanceof OldPhone) {
				oldPhones.add((OldPhone) phone);
			}
		}
		return oldPhones;
	}

	private static String getIdNewPhone() {
		ArrayList<NewPhone> newPhones = getNewPhones();
		if (newPhones.isEmpty()) {
			return "DTC001"; // Trả về ID mặc định nếu danh sách rỗng
		}

		int max = 0; // Khởi tạo max bằng 0
		for (NewPhone phone : newPhones) {
			String id = phone.getId();
			if (id.startsWith("DTC") && id.length() >= 6) { // Kiểm tra định dạng ID
				int numId = Integer.parseInt(id.substring(3));
				if (max < numId) {
					max = numId;
				}
			}
		}

		return String.format("DTC%03d", max + 1); // Tăng ID và định dạng
	}


	private static ArrayList<NewPhone> getNewPhones() {
		ArrayList<NewPhone> newPhones = new ArrayList<>();
		for (Phone phone : phones) {
			if (phone instanceof NewPhone) {
				newPhones.add((NewPhone) phone);
			}
		}
		return newPhones;
	}

	public static void update() {
		System.out.println("Nhap vao mã cập nhập ");
		String id = scanner.nextLine();
		if (id.startsWith("DTC") || id.startsWith("DTM")) {
			boolean check = false;
			for (Phone phone : phones) {
				if (phone.getId().equals(id)) {
					check = true;
					phone.input();
					System.out.println("cap nhap thanh cong");
					break;
				}

			}
			if (!check) {
				System.out.println("Khong tim thay ma cap nhap cap nhap");
			}
		} else {
			System.out.println("Khong tim thay ma cap nhap cap nhap");
		}
	}

	public static void delete() {
		System.out.print("Nhập vào mã muốn xóa: ");
		String id = scanner.nextLine();
		if (id.startsWith("DTC") || id.startsWith("DTM")) {
			boolean isExistPhone = false;
			for (Phone phone : phones) {
				if (phone.getId().equals(id)) {
					isExistPhone = true;
					System.out.printf("Bạn có xóa điện thoại có mã %s không?\n", id);
					System.out.println("Chọn Yes để xác nhận xóa, No để hủy");
					if ("yes".equalsIgnoreCase(scanner.nextLine())) {
						phones.remove(phone);
						System.out.println("Xóa thành công!");
					} else {
						System.out.println("Đã hủy việc xóa!");
					}
					break;
				}
			}
			if (!isExistPhone) {
				System.out.println("Không tìm thấy mã muốn xóa!");
			}
		} else {
			System.out.println("Mã không hợp lệ!");
		}
	}

	public static void menuSort() {
		int choice;
		while (true) {
			System.out.println("\n--- SẮP XẾP ĐIỆN THOẠI THEO GIÁ ---");
			System.out.println("1. Tăng dần");
			System.out.println("2. Giảm dần");
			System.out.println("3. Trở về Menu");
			System.out.print("Nhập lựa chọn: ");

			try {
				choice = Integer.parseInt(scanner.nextLine());
				switch (choice) {
					case 1:
						for (int i = 0; i < phones.size() - 1; i++) {
							for (int j = i + 1; j < phones.size(); j++) {
								if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
									Phone temp = phones.get(i);
									phones.set(i, phones.get(j));
									phones.set(j, temp);
								}
							}
						}
						System.out.println("Danh sách điện thoại được sắp xếp theo giá tăng dần:");
						display();
						break;
					case 2:
						for (int i = 0; i < phones.size() - 1; i++) {
							for (int j = i + 1; j < phones.size(); j++) {
								if (phones.get(i).getPrice() < phones.get(j).getPrice()) {
									Phone temp = phones.get(i);
									phones.set(i, phones.get(j));
									phones.set(j, temp);
								}
							}
						}
						System.out.println("Danh sách điện thoại được sắp xếp theo giá giảm dần:");
						display();
						break;
					case 3:
						System.out.println("Trở về menu chính...");
						return;
					default:
						System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số hợp lệ!");
			}
		}
	}

	private static void display() {
		if (phones.isEmpty()) {
			System.out.println("Danh sách điện thoại trống.");
		} else {
			for (int i = 0; i < phones.size(); i++) {
				System.out.println("Điện thoại " + (i + 1) + ":");
				phones.get(i).output();
			}
		}
	}

	public static void menuSearch() {
		int choose;
		while (true) {
			do {
				System.out.println("TÌM KIẾM ĐIỆN THOẠI");
				System.out.println("1. Tìm kiếm tất cả điện thoại");
				System.out.println("2. Tìm kiếm điện thoại cũ");
				System.out.println("3. Tìm kiếm điện thoại mới");
				System.out.println("4. Trở về menu chính");
				System.out.print("Mời bạn lựa chọn: ");
				choose = Integer.parseInt(scanner.nextLine());
				switch (choose) {
					case 1:
						menuSearchAllPhone();
						break;
					case 2:
						menuSearchOldPhone();
						break;
					case 3:
						menuSearchNewPhone();
						break;
					case 4:
						return;
					default:
						System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
				}
			} while (choose < 0 || choose > 4);
		}
	}

	private static void menuSearchAllPhone() {
		int choose;

		while (true) {
			do {
				System.out.println("TÌM KIẾM THEO TẤT CẢ ĐIỆN THOẠI:");
				System.out.println("1. Tìm kiếm theo giá");
				System.out.println("2. Tìm kiếm theo tên");
				System.out.println("3. Tìm kiếm theo hãng");
				System.out.println("4. Trở về menu Tìm kiếm");
				System.out.print("Mời bạn lựa chọn: ");
				choose = Integer.parseInt(scanner.nextLine());
				switch (choose) {
					case 1:
						System.out.println("Nhập vào khoảng giá muốn tìm");
						System.out.print("Nhập vào giá từ: ");
						int priceFrom = Integer.parseInt(scanner.nextLine());

						System.out.print("Nhập vào giá đến: ");
						int priceTo = Integer.parseInt(scanner.nextLine());

						int count = 1;
						for (Phone phone : phones) {
							if (phone.getPrice() >= priceFrom
											&& phone.getPrice() <= priceTo) {
								System.out.println("Thông tin điện thoại thứ " + count++);
								phone.output();
							}
						}
						break;
					case 2:
						System.out.print("Nhập vào tên cần tìm: ");
						String name = scanner.nextLine();
						count = 1;
						for (Phone phone : phones) {
							if (phone.getName().contains(name)) {
								System.out.println("Thông tin điện thoại thứ " + count++);
								phone.output();
							}
						}
						break;

					case 3:
						System.out.print("Nhập vào hãng điện thoại cần tìm: ");
						String manufacturer = scanner.nextLine();
						count = 1;
						for (Phone phone : phones) {
							if (phone.getManufacturer().contains(manufacturer)) {
								System.out.println("Thông tin điện thoại thứ " + count++);
								phone.output();
							}
						}
						break;

					case 4:
						return;
					default:
						System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
				}
			} while (choose < 0 || choose > 4);
		}
	}

	public static void menuSearchOldPhone() {
		List<OldPhone> oldPhones = getOldPhones();
		int choose;
		do {
			System.out.println("TÌM KIẾM ĐIỆN THOẠI Cũ");
			System.out.println("1. Tìm kiếm theo giá");
			System.out.println("2. Tìm kiếm theo tên");
			System.out.println("3. Tìm kiếm theo hãng");
			System.out.println("4. Trở về menu Tìm kiếm");
			System.out.print("Mời bạn lựa chọn: ");
			choose = Integer.parseInt(scanner.nextLine());
			switch (choose) {
				case 1:
					System.out.println("Nhập vào khoảng giá muốn tìm");
					System.out.print("Nhập vào giá từ: ");
					int priceFrom = Integer.parseInt(scanner.nextLine());

					System.out.print("Nhập vào giá đến: ");
					int priceTo = Integer.parseInt(scanner.nextLine());

					int count = 1;
					for (OldPhone phone : oldPhones) {
						if (phone.getPrice() >= priceFrom
										&& phone.getPrice() <= priceTo) {
							System.out.println(" thông tin điện thoại thứ " + count++);
							phone.output();
						}
					}
					break;
				case 2:
					System.out.print("Nhập vào tên cần tìm: ");
					String name = scanner.nextLine();
					count = 1;
					for (OldPhone phone : oldPhones) {
						if (phone.getName().contains(name)) {
							System.out.println(" thông tin điện thoại thứ " + count++);
							phone.output();
						}
					}
					break;

				case 3:
					System.out.print("Nhập vào hãng điện thoại cần tìm: ");
					String manufacturer = scanner.nextLine();
					count = 1;
					for (OldPhone phone : oldPhones) {
						if (phone.getManufacturer().contains(manufacturer)) {
							System.out.println(" SKF thoại thứ " + count++);
							phone.output();
						}
					}
					break;

				case 4:
					return;
				default:
					System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
			}
		} while (choose < 0 || choose > 4);
	}
	public static void menuSearchNewPhone() {

		List<NewPhone> newPhones = getNewPhones();
		int choose;
		do {
			System.out.println("TÌM KIẾM ĐIỆN THOẠI Cũ");
			System.out.println("1. Tìm kiếm theo giá");
			System.out.println("2. Tìm kiếm theo tên");
			System.out.println("3. Tìm kiếm theo hãng");
			System.out.println("4. Trở về menu Tìm kiếm");
			System.out.print("Mời bạn lựa chọn: ");
			choose = Integer.parseInt(scanner.nextLine());
			switch (choose) {
				case 1:
					System.out.println("Nhập vào khoảng giá muốn tìm");
					System.out.print("Nhập vào giá từ: ");
					int priceFrom = Integer.parseInt(scanner.nextLine());

					System.out.print("Nhập vào giá đến: ");
					int priceTo = Integer.parseInt(scanner.nextLine());

					int count = 1;
					for (NewPhone phone : newPhones) {
						if (phone.getPrice() >= priceFrom
										&& phone.getPrice() <= priceTo) {
							System.out.println(" thông tin điện thoại thứ " + count++);
							phone.output();
						}
					}
					break;
				case 2:
					System.out.print("Nhập vào tên cần tìm: ");
					String name = scanner.nextLine();
					count = 1;
					for (NewPhone phone : newPhones) {
						if (phone.getName().contains(name)) {
							System.out.println(" thông tin điện thoại thứ " + count++);
							phone.output();
						}
					}
					break;

				case 3:
					System.out.print("Nhập vào hãng điện thoại cần tìm: ");
					String manufacturer = scanner.nextLine();
					count = 1;
					for (NewPhone phone : newPhones) {
						if (phone.getManufacturer().contains(manufacturer)) {
							System.out.println(" SKF thoại thứ " + count++);
							phone.output();
						}
					}
					break;

				case 4:
					return;
				default:
					System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
			}
		} while (choose < 0 || choose > 4);
	}
	public static double calculateTotalPriceInStore() {

		double total = 0.0;
		for (Phone phone : phones) {
			total += phone.getPrice();
		}
		return total;
	}
		public static void applyDiscountToOldPhones(double percentDiscount) {

		for (Phone phone : phones) {
			if(phone instanceof OldPhone){
				((OldPhone) phone).applyDiscount(percentDiscount);
			}


		}



	}


}


