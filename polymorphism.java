import java.util.*;
public class polymorphism {
    public static void main(String[] args) {
        Shapes squ = new Square();
        Shapes cir = new Circle();
        Shapes tri = new Triangle();
        cir.area();
        squ.area();
        tri.area();
    }
}
class Shapes {
    void area(){
        System.out.println("I am in shapes.");
    }
}
class Square extends Shapes{
    void area(){
        System.out.println("Area is s*s.");
    }
}
class Circle extends Shapes{
    void area(){
        System.out.println("Area is pi*r*r.");
    }
}
class Triangle extends Shapes {
    void area(){
        System.out.println("Area is 1/2 * l * b.");
    }
}
  
