import java.util.*;
interface Animal {
    void makeSound();  // Abstract method (implicitly public and abstract)
}

// Implementing the interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Dog barks
    }
}
