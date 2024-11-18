package object;
import abstractClass.Person;
import enumPackage.Condition;

public class Znayka extends Person {
    public Znayka(String name, String lastName, int age){
        super(name, lastName, age);
    }

    @Override
    public void story(){
        System.out.print("А потом ");
    }

    public void see(String who){
        System.out.println(getName() + " увидел " + who);
    }

    public void turnOff(String what){
        System.out.println(Condition.HURRY + " выключил " + what);
    }

    @Override
    public String toString() {
        return getName();
    }
    @Override
    public boolean equals(Object obj) {
        Kolosok kolosok= (Kolosok) obj;
        return getName().length()==kolosok.getName().length();
    }
    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
