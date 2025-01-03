package ss5;

public class Cat  extends Animal implements Flyable{
    @Override
    public void tiengKeu() {
        System.out.println("meo meo");
    }
    public void  xemnha(){System.out.println("xem nha");}


    @Override
    public void fly() {
        System.out.println("cat fly");
    }
}
