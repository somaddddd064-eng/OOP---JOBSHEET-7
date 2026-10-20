public class AnimalMain {
    public static void main(String[] args) {

        Mammals lion = new Mammals("Fur", "Claws", 6, "Warm Blooded");
        System.out.println("LION");
        lion.mammalInfo();

        lion.hunting();
        lion.hunting("Zebra");
        lion.move();
        lion.giveBirth();

        System.out.println();

        Reptile snake = new Reptile("Scales", "Venom", 2, "Cold Blooded");
        System.out.println("SNAKE");
        snake.reptileInfo();

        snake.hunting();
        snake.hunting("Rat");
        snake.move();
        snake.layEggs();
    }
}