package pokemons;
import attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Audino extends Pokemon{
    public Audino (String name, int level){
        super(name, level);
        setStats(103, 60, 86, 60,	86,	50);
        setType(Type.NORMAL);
        setMove(new Refresh(), new DreamEater(), new HyperVoice(), new Flamethrower());
    }
}
