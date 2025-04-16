public class Bird extends Animal {
    private String name;
    public Bird(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp!");
    }
    public void fly() {
        System.out.println(name + " does: Flying!");
    }
}

