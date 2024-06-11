public class Squirtle extends Pokemon implements Agua {

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle atacando con placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle atacando con mordisco");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Squirtle atacando con arañazo");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle atacando burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle atacando pistola agua");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Squirtle atacando hidroBomba");
    }
}
