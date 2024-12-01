package enumPackage;

public enum Status {
    WEIGHTLESS("невесомый"), FALLING("падающий"), ANGRY("злой"), SPEEDY("шустрый"), NOTHING(""), PUZZLEMENT("озадаченный");

    private final String stat;

    Status(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return stat;
    }
}