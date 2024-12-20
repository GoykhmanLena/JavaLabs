package attacks;

import ru.ifmo.se.pokemon.*;

public final class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        return "С вероятностью 30% заставляет противника дрогнуть";
    }
}
