public class Mammals extends Animal {
    private String bloodType;

    public Mammals(String skin, String huntingGear, int age, String bloodType) {
        super(skin, huntingGear, age);
        this.bloodType = bloodType;
    }

    public void giveBirth() {
        System.out.println("Mammals reproduces by Giving birth");
    }

    public void move() {
        System.out.println("Mammals is walking or running use foot");
    }

    public void mammalInfo() {
        System.out.println("Skin         : " + skin);
        System.out.println("Hunting Gear : " + huntingGear);
        System.out.println("Age          : " + age);
        System.out.println("Blood Type   : " + bloodType);
    }
}