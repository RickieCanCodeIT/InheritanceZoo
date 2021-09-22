public abstract class Bird extends Animal{

    protected int eggsPerWeek;

    public Bird(boolean isAlive, String name, int eggsPerWeek) {
        super(isAlive, name);
        this.eggsPerWeek = eggsPerWeek;
    }

    public int getEggsPerWeek() {
        return eggsPerWeek;
    }

    public abstract void layEggs();
}
