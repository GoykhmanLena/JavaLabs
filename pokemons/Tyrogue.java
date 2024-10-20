package pokemons;
import attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tyrogue extends Pokemon{
    public Tyrogue(String name, int level){
        super(name, level);
        setStats(35, 35,	35,	35,	35,	35);
        setType(Type.FIGHTING);
        setMove(new RockSlide(), new WorkUp(), new Confide());
    }
}
