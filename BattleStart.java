import pokemons.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;


public class BattleStart {
    public static void main(String args[]){
        Battle b = new Battle();
        b.addAlly(new Audino("Аудусик", 3));
        b.addAlly(new Hitmonchan("Хитусик", 6));
        b.addAlly(new Mamoswine("Мамчик", 5));
        b.addFoe(new Piloswine("Пип", 5));
        b.addFoe(new Swinub("Свин", 5));
        b.addFoe(new Tyrogue("Тигр", 6));
        b.go();
    }
}
