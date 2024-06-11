public class Bulbasaur extends Pokemon implements Planta {

    public Bulbasaur(String nombre, int numPokedex, double peso, int temporada) {
        super(nombre, numPokedex, peso, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println( nombre + " atacando con placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println( nombre + " atacando mordisco");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println(nombre + " atacando arañazo");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println(nombre + " atacando drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println(nombre + " atacando paralizar");
    }
}
