import java.util.*;
public class abstraction {
    public static void main(String[] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();
        son.career();
        son.partner();
        daughter.career();
        daughter.partner();
    }
}
abstract class Parent{
    abstract void career();
    abstract void partner();
}
class Son extends Parent{
    void career(){
        System.out.println("I am going to be a man.");
    }
    void partner(){
        System.out.println("She will be my woman.");
    }
}
class Daughter extends Parent{
    void career(){
        System.out.println("I am going to be a woman.");
    }
    void partner(){
        System.out.println("He will be my man." );
    }
}
