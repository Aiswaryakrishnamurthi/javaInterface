package javaInterface;

//Using Lambda Expressions
/*If the interface is a functional interface (an interface with only one abstract method),
you can use a lambda expression to provide the implementation.*/

// also with anonymous class
@FunctionalInterface
 interface Animal1 {
    void eat(); // Functional interface
}

public class Test1 {
    public static void main(String[] args) {
        Animal1 myAnimal = () -> System.out.println("Lambda Animal is eating.");
        myAnimal.eat();
        
        Animal1 myAnimal1 = new Animal1() {
            @Override
            public void eat() {
                System.out.println("Anonymous Animal is eating.");
            }

         
        };
        
        myAnimal1.eat();
      
    }
}
