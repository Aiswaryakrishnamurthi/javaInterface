package javaInterface;

//Creating a class that implements the interface.

interface Animal {
    void eat(); // Abstract method
    void sleep(); // Abstract method
}

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    public static void main(String[] args) {
        Animal myDog = new Dog(); // Creating an object of the implementing class
        myDog.eat();
        myDog.sleep();
    }
}
