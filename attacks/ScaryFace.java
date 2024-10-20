package attacks;

import ru.ifmo.se.pokemon.*;

public final class ScaryFace extends StatusMove {
    public ScaryFace(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -2);
    }

    @Override
    protected String describe(){
        return "Пугает по полной и уменьшает скорость противника на 2";
    }
}
