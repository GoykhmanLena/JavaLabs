package attacks;

import ru.ifmo.se.pokemon.*;

public final class Refresh extends StatusMove {
    public Refresh() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        if (p.getCondition().equals(Status.PARALYZE) || p.getCondition().equals(Status.POISON) || p.getCondition().equals(Status.BURN)){
            p.restore();
        }
    }

    @Override
    protected String describe() {
        return "Лечит паралич, отравления и ожоги";
    }
}
