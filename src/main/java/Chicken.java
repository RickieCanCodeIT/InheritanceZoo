public class Chicken extends Bird {

    private int amountOfMeat;


    public Chicken(boolean isAlive, String name, int amountOfMeat, int eggsPerWeek) {
        super(isAlive, name, eggsPerWeek);
        this.amountOfMeat = amountOfMeat;
    }

    public int getAmountOfMeat() {
        return amountOfMeat;
    }

    @Override
    public void move() {
        System.out.println(name + " walks on the ground.");
    }

    @Override
    public void animalSound() {
        System.out.println(name +  " goes Cluck Cluck");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats some food");
        eggsPerWeek++;
        amountOfMeat += 5;
    }

    public void slaughter() {
        System.out.println("You get " + amountOfMeat + " pounds of meat");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays " + eggsPerWeek + " eggs in a coop.");
    }
}
