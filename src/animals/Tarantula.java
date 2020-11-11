package animals;

public class Tarantula extends Animal {
    public Tarantula(String name, int starterLifePoint) {
        super(name, starterLifePoint);
    }
    @Override
    public String toString() {
        return "Tarantula " + name + ": " + lifePoint +
                ' ';
    }
}
