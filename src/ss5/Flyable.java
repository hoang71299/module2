package ss5;

public interface Flyable {
    int max = 100;
    void fly();
    default void fly2(){
        System.out.println("co body default");
    }
    static void fly3(){
        System.out.println("Co body - static");
    }
}
