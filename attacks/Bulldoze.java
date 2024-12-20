package attacks;

import ru.ifmo.se.pokemon.*;
public final class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe(){
        return "Бульдозит по полной и уменьшает скорость противника на 1";
    }
}
