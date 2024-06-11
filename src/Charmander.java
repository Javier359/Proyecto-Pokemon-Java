public class Charmander extends Pokemon implements Fuego{

    public Charmander(String nombre, int numPokedex, double peso, int temporada) {
        super(nombre, numPokedex, peso, temporada);
    }

    @Override
    protected void atacarAranazo() {
        System.out.println(nombre + " atacando con arañazo");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println(nombre + " atacando placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println(nombre + " atacando mordisco");
    }

    @Override
    public void atacarPunoFuego() {
        System.out.println(nombre + " atacando puño fuego");
    }

    @Override
    public void aracarLanzallamas() {
        System.out.println(nombre + " atacando lanzallamas");
    }

    @Override
    public void atacarAsquas() {
        System.out.println(nombre + " atacando asquas");
    }
}
