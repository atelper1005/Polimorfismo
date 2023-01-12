package DAW.prog.UD3.Polimorfismo;

public class SolucionInstrumentos {

    public static void main(String[] args) {
        Instrumentos i = new Guitarra1();
        i = new Tambor1();
        i.sonidoQueEmite();
    }
}

class Instrumentos {
    public void sonidoQueEmite() {
        System.out.println();
    }
}

class Guitarra1 extends Instrumentos {
    public void sonidoQueEmite() {
        System.out.println("brrrmmm");
    }
}


class Tambor1 extends Instrumentos {
    public void sonidoQueEmite() {
        System.out.println("pum pum");
    }
}
