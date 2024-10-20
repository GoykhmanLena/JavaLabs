package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class FirePunch extends PhysicalMove {
    public FirePunch(){
        super(Type.FIRE, 75, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() >= 0.1){
            Effect.burn(p);
        }
    }

    @Override
    protected String describe() {
        return "Наносит урон и имеет 10% шанс поджечь цель";
    }
}
