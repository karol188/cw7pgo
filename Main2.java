public class Main2 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal lion = new Lion();
        Animal dog = new Dog();
        Animal wolf = new Wolf();

        cat.makeNoise();
        cat.roam();

        lion.makeNoise();
        lion.roam();

        dog.makeNoise();
        dog.roam();

        wolf.makeNoise();
        wolf.roam();
    }
}
