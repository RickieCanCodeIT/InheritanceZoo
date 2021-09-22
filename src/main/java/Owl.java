public class Owl extends Bird implements Flying, Feathered {

    private int killsPerNight;

    public Owl(boolean isAlive, String name, int eggsPerWeek, int killsPerNight) {
        super(isAlive, name, eggsPerWeek);
        this.killsPerNight = killsPerNight;
    }

    @Override
    public void move() {
        System.out.println(name + " hops on the ground");
    }

    @Override
    public void animalSound() {
        System.out.println(name + " goes hoot!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats " + killsPerNight + " mice");

    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays " + eggsPerWeek + " eggs in a nest.");
    }

    @Override
    public void fly() {
        System.out.println(name + " soars through the air!");
    }

    @Override
    public void land() {
        System.out.println(name + " lands by its nest");
    }

    @Override
    public void cleanFeathers() {
        System.out.println(name + " cleans its feathers");
    }
}
