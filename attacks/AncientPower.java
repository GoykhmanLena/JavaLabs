package attacks;

import ru.ifmo.se.pokemon.*;
public final class AncientPower extends SpecialMove{
    public AncientPower(){
        super(Type.ROCK, 60, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.ATTACK, 1);
            p.setMod(Stat.DEFENSE, 1);
            p.setMod(Stat.SPECIAL_DEFENSE, 1);
            p.setMod(Stat.SPECIAL_ATTACK, 1);
            p.setMod(Stat.SPEED, 1);
        }
    }

    @Override
    protected String describe() {
        return "С вероятностью 10% увеличивает stats на 1";
    }
}
