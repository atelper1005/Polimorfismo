package DAW.prog.UD3.Polimorfismo;

public class creacionAnimal {

    public static void main(String[] args) {

        Animal a;
        a = new Lion();
        a.speak();
        a = new Bird();
        a.speak();
        ((Bird)a).fly();
    }
}
