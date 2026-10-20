
public abstract class Animal {
    protected String skin;
    protected String huntingGear;
    protected int age;

    public Animal(String skin, String huntingGear, int age) {
        this.skin = skin;
        this.huntingGear = huntingGear;
        this.age = age;
    }

    public void hunting() {
        System.out.println("Animal is hunting use : " + huntingGear);
    }

    public void hunting(String prey) {
        System.out.println("Animal is hunting : " + prey);
    }

    public abstract void move();
}