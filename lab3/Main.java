import arrayList.Swearing;
import object.Kolosok;
import object.Znayka;
import arrayList.Swearing;
import record.Swear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class StartStory {
            public void start() {
//                Scanner scanner = new Scanner(System.in);
                boolean start = false;
                System.out.println("Хочешь почитать историю? ( да \\ нет )");
                while (!start) {
                    String message = new Scanner(System.in).nextLine().toLowerCase();
                    if (message.equals("да"))
                        start = true;
                    else System.out.println(
                                "Ответ неверный! Напиши: \"да\" !!!!");
                }
            }
        }

        StartStory startStory = new StartStory();
        startStory.start();


        Kolosok kolosok = new Kolosok("Колосок");
        Znayka znayka = new Znayka("Знайка","Зазнайка",13);
        kolosok.story();
        kolosok.flutt("в воздухе", znayka);
        znayka.see(kolosok.getName());
        znayka.turnOff("невесомость", kolosok);
        znayka.story();
        kolosok.wentDown("тотчас же", "вниз");
        kolosok.callSwear("рассердился на всех", znayka);
        kolosok.swore("полицейских");
        kolosok.callSwear("их", znayka);
        //System.out.println(znayka.getStatus()); //проверка состояния знайки
        //System.out.println(kolosok.getStatus());


        System.out.println("\nДополнительная информация:");
        System.out.println(kolosok.equals(znayka));
        System.out.println(kolosok);
        System.out.println(kolosok.hashCode());

    }
}