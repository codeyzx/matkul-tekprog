import animals.Animal;
import animals.Dog;
import person.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Dog object
        Dog dog = new Dog("Zowy", 3, "Pitbull"); // Dog is-a type of Animal
        dog.makeSound();
        dog.wagTail();

        // Create a cat object
        Animal cat = new Animal("Kitty", 2);
        Person person = new Person(cat); // Person HAS-A relationship with Animal
        person.playWithPet();
        person.callPet();
        person.myPet(cat);
    }
}
