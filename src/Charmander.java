public class Charmander extends Pokemon implements Fuego{

    public Charmander() {
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Charmander atacando con arañazo");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander atacando placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander atacando mordisco");
    }

    @Override
    public void atacarPunoFuego() {
        System.out.println("Charmander atacando puño fuego");
    }

    @Override
    public void aracarLanzallamas() {
        System.out.println("Charmander aracar lanzallamas");
    }

    @Override
    public void atacarAsquas() {
        System.out.println("Charmander atacando asquas");
    }
}
