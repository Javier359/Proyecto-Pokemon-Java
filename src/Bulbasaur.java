public class Bulbasaur extends Pokemon implements Planta {
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur atacando con placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur atacando mordisco");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Bulbasaur atacando arañazo");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur atacando drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur atacando paralizar");
    }
}
