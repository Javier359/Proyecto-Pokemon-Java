public abstract class Pokemon {

    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected int temporada;

    public Pokemon(String nombre, int numPokedex, double peso, int temporada) {
        this.nombre = nombre;
        this.numPokedex = numPokedex;
        this.peso = peso;
        this.temporada = temporada;
    }

    protected abstract void atacarPlacaje();

    protected abstract void atacarMordisco();

    protected abstract void atacarAranazo();

}
