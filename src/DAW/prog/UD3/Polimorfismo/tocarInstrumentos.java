package DAW.prog.UD3.Polimorfismo;

public class tocarInstrumentos {

    public static void main(String[] args) {
        Instrumento i = new Guitarra();
        i = new Tambor();
        i.tocar();
    }
}
