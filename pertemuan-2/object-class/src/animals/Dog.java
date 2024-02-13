package animals;

// Dog class is a subclass of Animal
// Using the extends keyword to inherit from the Animal class
// Using Inheritance (IS-A relationship)
public class Dog extends Animal {
    // Access modifier is private, so it can only be accessed by the Dog class
    private String breed;

    // Constructor is public, so it can be accessed by any class
    public Dog(String name, int age, String breed) {
        // Call the superclass constructor of Animal
        super(name, age);
        // Set the breed
        this.breed = breed;
    }

    // Overriding the makeSound() method from the superclass (Animal)
    // From "Animal sound" to "Wuff, Wuff
    @Override
    public void makeSound() {
        System.out.println("Wuff, Wuff");
    }

    // Method wagTail() is public, so it can be accessed by any class
    public void wagTail() {
        System.out.println("Dog wagging tail");
    }
}