package DAW.prog.UD3.Polimorfismo;

public class Guitarra extends Instrumento{
    @Override
    void tocar() {
        String Sonido = "BRRRM";
        System.out.println(Sonido);
    }
}
