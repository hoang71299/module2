package ss4;

import java.util.Scanner;

public class Person {
    private  int id ;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public  void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao id : ");
        id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap vao ten : ");
        name = scanner.nextLine();

    }
    public void output(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
}
