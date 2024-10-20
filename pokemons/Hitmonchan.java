package pokemons;
import attacks.*;
public final class Hitmonchan extends Tyrogue{
    public Hitmonchan (String name, int level){
        super(name, level);
        setStats(50, 105, 79, 35, 110, 76);
        addMove(new FirePunch());
    }
}
