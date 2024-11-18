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
                while (start == false) {
                    String message = new Scanner(System.in).nextLine().toLowerCase();
                    if (message.equals("да"))
                        start = true;
                    else System.out.println(
                                "Ответ неверрный! Напиши: \"да\" !!!!");
                }
            }
        }

        StartStory startStory = new StartStory();
        startStory.start();


        Kolosok kolosok = new Kolosok("Колосок");
        Znayka znayka = new Znayka("Знайкак","Зазнайка",13);
        kolosok.story();
        kolosok.flutt("в воздухе");
        znayka.see(kolosok.getName());
        znayka.turnOff("невесомость");
        znayka.story();
        kolosok.wentDown("тотчас же", "вниз");
        kolosok.swore("полицейских");
        kolosok.callSwear("их");

        System.out.println("\nДополнительная информация:");
        System.out.println(kolosok.equals(znayka));
        System.out.println(kolosok);
        System.out.println(kolosok.hashCode());

    }
}