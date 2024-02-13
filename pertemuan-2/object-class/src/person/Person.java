package person;

import animals.Animal;

public class Person {
    // Access modifier is private, so it can only be accessed by the Person class
    // Uses-A relationship with Animal
    private Animal pet;

    // Constructor is public, so it can be accessed by any class
    public Person(Animal pet) {
        this.pet = pet;
    }

    // Method callPet() is public, so it can be accessed by any class
    public void callPet() {
        System.out.println("Come here, " + pet.getName());
    }

    // Method playWithPet() is public, so it can be accessed by any class
    public void playWithPet() {
        System.out.println("Playing with pet");
    }

    // Uses-A relationship with Animal
    public void myPet(Animal pet) {
        Animal pets = new Animal(pet.getName(), pet.getAge());
        System.out.println("My pet is " + pets.getName() + " and it is " + pets.getAge() + " years old");
    }

}