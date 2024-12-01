package object;

import abstractClass.Person;
import action.Flutterable;
import arrayList.Swearing;
import customException.PossibilityException;
import enumPackage.Condition;
import enumPackage.Status;
import record.Swear;


public class Kolosok extends Person implements Flutterable {
    public Kolosok(String name) {
        super(name);
    }
/*    @Override
    public String move(){
        return
    }
*/


    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void story() {
        System.out.println("Произошло следующее:");
        super.setStatus(Status.WEIGHTLESS);
    }

    public void wentDown(String when, String where) {
        System.out.println(getName() + " " + when + " опустился " + where);
    }

    public void swore(String who) {
        super.setStatus(Status.ANGRY);
        System.out.println(Condition.SCARED + " наругался на " + who);
    }

    Swearing swearing = new Swearing();

    Swear swear1 = new Swear("", "головорезы", true);
    Swear swear2 = new Swear("", "пираты", true);
    Swear swear3 = new Swear("", "бандиты", true);
    Swear swear4 = new Swear("угорелые", "паразиты", true);
    Swear swear5 = new Swear("", "скоты", true);

    public void setSwear(Swear... swear) {
        for (int i = 0; i < swear.length; i++) {
            swearing.addSwear(swear[i]);
        }
    }

    public void callSwear (String who, Person person){
        try{
            if (this.getStatus() != Status.ANGRY){
                throw new PossibilityException("WARNING: он ещё недостаточно зол, чтобы ругаться!");
            }
            person.setStatus(Status.PUZZLEMENT);
            setSwear(swear1, swear2, swear3, swear4, swear5);
            System.out.println("назвал " + who + " " + swearing.getSwears());
        }
        catch (PossibilityException exc){
            System.out.println(exc.getMessage());
        }
    }

    @Override
    public void flutt(String where) {
        System.out.println(getName() + " " + Condition.HELPLESSLY + " затрепыхался " + where);
    }
    public void flutt(String where, Person person) {
        person.setStatus(Status.SPEEDY);
        System.out.println(getName() + " " + Condition.HELPLESSLY + " затрепыхался " + where);
    }


    @Override
    public boolean equals(Object obj) {
        Znayka znayka = (Znayka) obj;
        return getName().length() == znayka.getName().length();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
