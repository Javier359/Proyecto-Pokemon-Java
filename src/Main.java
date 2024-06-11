
public class Main {
    public static void main(String[] args) {

        //creacion de objeto pokemon
        Pikachu pikachu = new Pikachu("Pablo", 10, 15, 1);
        Charmander charmander = new Charmander("Llamitas", 1, 18, 1);
        Bulbasaur bulbasaur = new Bulbasaur("Rosa", 2, 22, 1);
        Squirtle squirtle = new Squirtle("Tortugon", 3, 31, 1);

        pikachu.atacarAranazo();
        pikachu.atacarImpactrueno();
        charmander.atacarAranazo();
        charmander.aracarLanzallamas();
        bulbasaur.atacarAranazo();
        bulbasaur.atacarDrenaje();
        squirtle.atacarAranazo();
        squirtle.atacarBurbuja();
    }
}