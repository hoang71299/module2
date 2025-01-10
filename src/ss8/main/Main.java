package ss8.main;

import ss8.entity.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static 	List<Customer> customerList = new ArrayList<>();

//	List<T> vs List<Object>


	/**
	 * Chay chuong trinh
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer choice = 0;

		while (true) {
			do {
				System.out.println("===========================");
				System.out.println("1. Nhap du lieu ");
				System.out.println("2. Xuat du lieu ");
				System.out.println("3.Tim kiem nguoi dung");
				choice = scanner.nextInt();
				switch (choice) {
					case 1:
						System.out.println("Nhap du lieu cho khach hang");
						Customer customer = new Customer();
						customer.input();
						System.out.println("Nhap so de chon loai bao hiem");
						System.out.println("1. Bao hiem tu vong");
						System.out.println("2. Bao hiem sinh ky");
						System.out.println("3. Bao hiem hop dong");
						int chonLoaiBaoHiem = scanner.nextInt();
						switch (chonLoaiBaoHiem) {
							case 1:
								BaoHiem baoHiemTuVong = new BaoHiemTuVong();
								baoHiemTuVong.input();
								customer.setBaoHiem(baoHiemTuVong);
								break;
							case 2:
								BaoHiem baoHiemSinhKy = new BaoHiemSinhKy();
								baoHiemSinhKy.input();
								customer.setBaoHiem(baoHiemSinhKy);
								break;
							case 3:
								BaoHiem baoHiemHopDong = new BaoHiemHopDong();
								baoHiemHopDong.input();
								customer.setBaoHiem(baoHiemHopDong);
								break;
							default:
								System.out.println("Loi nhap bao hiem");
						}
						customerList.add(customer);
						break;

					case 2:
						System.out.println("Xuat thong tin Khach hang");
						for (Customer customer1 : customerList) {
							customer1.output();
						}
						break;
					case 3:
						System.out.println("Tim kiem nguoi dung");
						System.out.println("Nhap cmnd");
						boolean isEmpty = false;
						String cmnd = scanner.next();
						for (Customer customer1 : customerList) {
							if (customer1.getCmnd().contains(cmnd)) {
								customer1.output();
								isEmpty = true;
							}
						}
						if (isEmpty == false){
							System.out.println("Khong tim thay nguoi dung");
						}
				}
			} while (choice > 4);
		}
	}
}
