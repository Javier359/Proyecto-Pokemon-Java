public class Pikachu extends Pokemon implements Electrico{
    public Pikachu(String nombre, int numPokedex, double peso, int temporada) {
        super(nombre, numPokedex, peso, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println(nombre + " atacando con placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println(nombre + " atacando con mordisco");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println(nombre + " atacando con arañazo");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println(nombre + " atacando con impactrueno");
    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println(nombre + " atacando con puño trueno");
    }
}
