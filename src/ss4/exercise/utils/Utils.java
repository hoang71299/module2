package ss4.exercise.utils;

import ss4.exercise.entity.NewPhone;
import ss4.exercise.entity.OldPhone;
import ss4.exercise.entity.Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Phone> phones = new ArrayList<>();


    static {
        phones.add(new OldPhone("DTC001", "Iphone 11", 4000000.0, 12, "Apple"
                , 100, "Da qua su dung"));
        phones.add(new OldPhone("DTC002", "Iphone 12", 5000000.0, 12, "Apple"
                , 100, "Da qua su dung"));
        phones.add(new NewPhone("DTM001", "Iphone 12", 5000000.0, 12,
                "Apple", 100));
        phones.add(new NewPhone("DTM002", "Iphone 12", 5000000.0, 12,
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
                            System.out.println("Thong tin dien thoai cu thứ " + (i + 1) + " : ");
                            phones.get(i).output();
                        }

                        break;
                    case 2:
                        System.out.println("Danh sach dien thoai cu");
                        int count = 1;
                        for (int i = 0; i < phones.size(); i++) {
                            if (phones.get(i) instanceof OldPhone) {
                                System.out.println("Thong tin dien thoai cu thu " + count++ + " : "+ " : ");
                                phones.get(i).output();
                            }
                        }
                        break;

                    case 3:
                        count = 1;
                        for (int i = 0; i < phones.size(); i++) {
                            if (phones.get(i) instanceof NewPhone) {
                                System.out.println("Thong tin dien thoai moi thu " + count++ + " : ");
                                phones.get(i).output();
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

        if (id.startsWith("DTC") || id.startsWith("DTH")) {
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
}
