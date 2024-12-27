package ss4.exercise.main;




import ss4.exercise.entity.NewPhone;
import ss4.exercise.entity.OldPhone;


import java.util.ArrayList;
import java.util.Scanner;
import static ss4.exercise.utils.Utils.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        while (true) {
            do {
                System.out.println("-- CHUONG TRINH QUAN LY DIEN THOAI --");
                System.out.println("1. Xem danh sach dien thoai");
                System.out.println("2. Them moi");
                System.out.println("3. Cap nhat");
                System.out.println("4. Xoa");
                System.out.println("5. Sap xep theo gia");
                System.out.println("6. Tim kiem");
                System.out.println("7. Tinh tong tien");
                System.out.println("8. Giam gia cho dien thoai cu");
                System.out.println("9. Thoat");
                System.out.println("Moi ban chon chuc nang : ");
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        menuList();
                        break;
                    case 2:
                        menuAdd();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le vui long chon lai");
                }

            } while (choice < 1 || choice > 9);

        }
    }


}
