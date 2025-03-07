import java.util.*;
class Address {
    String city;
    Address(String city) { this.city = city; }
    // Deep Copy Constructor
    Address(Address other) { this.city = other.city; }
}

class Person implements Cloneable {
    String name;
    Address address;
    
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow Copy
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep Copy
    public Person deepCopy() {
        return new Person(this.name, new Address(this.address));
    }
}

public class ShallowAndDeep {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        Person p1 = new Person("John", addr);
        
        // Shallow Copy
        Person p2 = (Person) p1.clone();
        // Deep Copy
        Person p3 = p1.deepCopy();
        
        // Modify original object's address
        p1.address.city = "Los Angeles";
        
        System.out.println("Shallow Copy: " + p2.address.city); // Affected (same reference)
        System.out.println("Deep Copy: " + p3.address.city);    // Unaffected (new object)
    }
}

