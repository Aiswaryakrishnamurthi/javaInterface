package javaInterface;

//Using Lambda Expressions
/*If the interface is a functional interface (an interface with only one abstract method),
you can use a lambda expression to provide the implementation.*/
@FunctionalInterface
 interface Animal1 {
    void eat(); // Functional interface
}

public class Test1 {
    public static void main(String[] args) {
        Animal1 myAnimal = () -> System.out.println("Lambda Animal is eating.");
        myAnimal.eat();
    }
}
