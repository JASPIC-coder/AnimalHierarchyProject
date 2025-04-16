public class Main {
    public static void main(String[] args) {
        Bird myBird = new Bird("Tweety");
        myBird.makeSound();
        myBird.fly();
        System.out.println();

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}
