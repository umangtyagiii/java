import java.util.*;
class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override  // Ensures correct method overriding
    void display() {
        System.out.println("Child class method");
    }
}

public class annotations {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();  // Output: Child class method
    }
}
