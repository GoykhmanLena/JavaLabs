package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() >= 0.1){
            Effect.burn(p);
        }
    }

    @Override
    protected String describe() {
        return "Наносит урон и с вероятностью 10% поджигает противника";
    }
}
