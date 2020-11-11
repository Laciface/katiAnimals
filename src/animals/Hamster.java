package animals;

public class Hamster extends Animal {
    public Hamster(String name, int starterLifePoint) {
        super(name, starterLifePoint);
    }
    @Override
    public String toString() {
        return "Hamster " + name + ": " + lifePoint +
                ' ';
    }
}
