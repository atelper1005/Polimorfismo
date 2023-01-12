package DAW.prog.UD3.Polimorfismo;

public class Bird extends Animal implements Flyable{

    @Override
    public void speak() {
        System.out.println("pio pio");
    }

    @Override
    public void fly() {

    }
}
