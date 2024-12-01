package enumPackage;

public enum Condition {
    HELPLESSLY("беспомощно"), HURRY("спеша"), SCARED("испуганно");
    final String name;
    Condition(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
