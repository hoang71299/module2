package ss4.exercise.entity;

import java.util.Scanner;

public class NewPhone extends Phone{
    private int quantity;
    public NewPhone() {
    }

    public NewPhone(String id, String name, Double price, int warranty, String manufacturer, int quantity) {
        super(id, name, price, warranty, manufacturer);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Nhap vao so luong : ");
        quantity = Integer.parseInt(scanner.nextLine());
    }
    public void output(){
        super.output();
        System.out.println("Quantity : " + quantity);
    }

}
