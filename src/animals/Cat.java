package animals;

public class Cat extends Animal {
    public Cat(String name, int starterLifePoint) {
        super(name, starterLifePoint);
    }

    @Override
    public String toString() {
        return "Cat " + name + ": " + lifePoint +
                ' ';
    }
}
