package Task3;

/**
 * Организация
 */

public class Enitity implements PersonalData{

    public Enitity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    private String name;

    private String inn;

    @Override
    public String getInn() {
        return null;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", name, inn);
    }
}
