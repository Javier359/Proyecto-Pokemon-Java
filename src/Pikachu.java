public class Pikachu extends Pokemon implements Electrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu atacando con placaje");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu atacando con mordisco");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Pikachu atacando con arañazo");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu atacando con impactrueno");
    }

    @Override
    public void atacarPunoTrueno() {
        System.out.println("Pikachu atacando con puño trueno");
    }
}
