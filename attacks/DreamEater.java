package attacks;

import ru.ifmo.se.pokemon.*;

public final class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        if (!p.getCondition().equals(Status.SLEEP)){
            super.applyOppDamage(p, v);
        }
    }

    @Override
    protected void applySelfDamage(Pokemon p, double v) {
        p.setMod(Stat.HP, (int) (-(v/2)));
    }

    @Override
    protected String describe() {
        return "Наносит урон спящим противникам, восстанавливает 50% потерянного HP";
    }
}
