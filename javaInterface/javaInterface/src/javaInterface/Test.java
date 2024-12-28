package javaInterface;

//Using Anonymous Inner Classes

public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Anonymous Animal is eating.");
            }

            @Override
            public void sleep() {
                System.out.println("Anonymous Animal is sleeping.");
            }
        };
        
        myAnimal.eat();
        myAnimal.sleep();
    }
}

