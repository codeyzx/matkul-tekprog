package animals;

public class Animal {
    // Access modifier is protected, so it can be accessed by the subclass
    protected String name;
    protected int age;

    // Constructor is public, so it can be accessed by any class
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method getName() is public, so it can get name of the animal from any class
    public String getName() {
        return name;
    }

    // Method getAge() is public, so it can get age of the animal from any class
    public int getAge() {
        return age;
    }

    // Method setName() is public, so it can set name of the animal from any class
    public void setName(String name) {
        this.name = name;
    }

    // Method makeSound() is public, so it can be accessed by any class because
    // encapsulation is not a concern here
    public void makeSound() {
        System.out.println("Animal sound");
    }
}
