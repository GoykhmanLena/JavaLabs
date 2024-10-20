package attacks;

import ru.ifmo.se.pokemon.*;

public final class HyperVoice extends SpecialMove {
    public HyperVoice(){
        super(Type.NORMAL, 90, 100);
    }

    @Override
    protected String describe() {
        return "Использует HyperVoice";
    }
}
