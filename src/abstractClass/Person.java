package abstractClass;

public abstract class Person {
    private String lastName;
    private String name;
    private int age;
    public Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }

    public abstract void story();
}