package ss3_static.exercise.bai2.main;

import static ss3_static.exercise.bai2.utils.MathUtils.*;

public class Main {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.5;

        double sum = sum(a, b);
        double sub = sub(a, b);
        double mul = mul(a, b);
        double div = div(a, b);

        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + sub);
        System.out.println("Tich: " + mul);
        System.out.println("Thuong: " + div);

    }
}
