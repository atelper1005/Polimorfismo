package DAW.prog.UD3.Polimorfismo;

public class Tambor extends Instrumento{

    @Override
    void tocar() {
        String Sonido = "Pum pum";
        System.out.println(Sonido);
    }
}
