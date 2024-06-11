public class Squirtle extends Pokemon implements Agua {

    public Squirtle(String nombre, int numPokedex, double peso, int temporada) {
        super(nombre, numPokedex, peso, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println( nombre + " atacando con placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println( nombre + " atacando con mordisco");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println( nombre + " atacando con arañazo");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println( nombre + " atacando burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println(nombre + " atacando pistola agua");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println(nombre + " atacando hidroBomba");
    }
}
