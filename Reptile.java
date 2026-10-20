public class Reptile extends Animal {
    private String bloodType;

    public Reptile(String skin, String huntingGear, int age, String bloodType) {
        super(skin, huntingGear, age);
        this.bloodType = bloodType;
    }

    public void layEggs() {
        System.out.println("Reptile reproduces by lay eggs");
    }

    public void move() {
        System.out.println("Reptile is walking with their body");
    }

    public void reptileInfo() {
        System.out.println("Skin         : " + skin);
        System.out.println("Hunting Gear : " + huntingGear);
        System.out.println("Age          : " + age);
        System.out.println("Blood Type   : " + bloodType);
    }
}