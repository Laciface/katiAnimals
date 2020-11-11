package animals;

public abstract class Animal {

    protected String name;
    private static final int MAX_LIFE_POINTS = 70;
    protected int lifePoint;

    public Animal(String name, int starterLifePoint) {
        this.name = name;
        this.lifePoint = starterLifePoint;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint += lifePoint;
    }

    public boolean isAnimalDead(){
        return lifePoint <= 0;
    }

    public void setMaxHealth(){
        if (getLifePoint() > 70) {
            lifePoint = 70;
        }
    }


}
