package ss4.exercise.utils;

import ss4.exercise.entity.NewPhone;
import ss4.exercise.entity.OldPhone;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();

    static {
        oldPhones.add(new OldPhone("DTC001", "Iphone 11", 4000000.0, 12, "Apple"
                , 100, "Da qua su dung"));
        oldPhones.add(new OldPhone("DTC002", "Iphone 12", 5000000.0, 12, "Apple"
                , 100, "Da qua su dung"));
        newPhones.add(new NewPhone("DTM001", "Iphone 12", 5000000.0, 12,
                "Apple", 100));
        newPhones.add(new NewPhone("DTM002", "Iphone 12", 5000000.0, 12,
                "Apple", 100));

    }
    public static void menuList() {

        int choice;
        while (true) {
            do{
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
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai cu thứ " + (i + 1) + " : ");
                            oldPhones.get(i).output();
                        }
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai Mới thu " + (i + 1) + " : ");
                            newPhones.get(i).output();
                        }
                        break;
                    case 2:
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai cu thu " + (i + 1) + " : ");
                            oldPhones.get(i).output();
                        }
                        break;

                    case 3:
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai Mới thu " + (i + 1) + " : ");
                            newPhones.get(i).output();
                        }
                        break;

                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le vui long chon lai");

                }
            }while (choice < 1 || choice > 4);

        }

    }
    public static void menuAdd(){
        int choice ;
        while(true){
            do{
                System.out.println("Themn moi dien thoai");
                System.out.println("1. Them dien thoai cu");
                System.out.println("2. Them dien thoai moi");
                System.out.println("3. Quay lai trang chủ");
                System.out.println("Moi ban chon chuc nang : ");
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice){
                    case 1:
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.input();
                        oldPhone.setId(getIdOldPhone());
                        oldPhones.add(oldPhone);
                        System.out.println("Them dien thoai cu thanh cong");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(getIdOldPhone());
                        newPhones.add(newPhone);
                        System.out.println("Them dien thoai moi thanh cong");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le vui long chon lai");
                }
            }while (choice < 1 || choice > 4);
        }
    }
    private static String getIdOldPhone() {
        // max id => id + 1
        if (oldPhones.size() == 0) {
            return "DTC001";
        }

        int max = Integer.parseInt(oldPhones.get(0).getId().substring(3));

        for (int i = 1; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }

        return String.format("DTC%03d", max + 1).replace(" ", "0");
    }
    private static String getIdNewPhone() {
        // max id => id + 1
        if (newPhones.size() == 0) {
            return "DTM001";
        }

        int max = Integer.parseInt(newPhones.get(0).getId().substring(3));

        for (int i = 1; i < newPhones.size(); i++) {
            int id = Integer.parseInt(newPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }

        return String.format("DTM%03d", max + 1).replace(" ", "0");
    }
    public static void update(){
        System.out.println("Nhap vao mã cập nhập ");
        String id = scanner.nextLine();
        if(id.startsWith("DTC")){
            boolean check = false;
            for (OldPhone oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    check = true;
                    oldPhone.input();
                    System.out.println("cap nhap thanh cong");
                    break;
                }

            }
            if(!check){
                System.out.println("Khong tim thay ma cap nhap cap nhap");
            }
        }else if(id.startsWith("DTM")){
            boolean check = false;
            for (NewPhone newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    check = true;
                    newPhone.input();
                    System.out.println("cap nhap thanh cong");
                    break;
                }
                if(!check){
                    System.out.println("Khong tim thay ma cap nhap cap nhap");
                }
            }
        }else{
            System.out.println("Khong tim thay ma cap nhap cap nhap");
        }
    }
}