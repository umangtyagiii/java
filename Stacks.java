import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack <Integer> system= new Stack<>();
        CustomStack ting = new CustomStack();
        ting.push(100);
        system.push(10);
        system.push(20);
        system.push(30);
        System.out.println(system);
        system.pop();
        System.out.println(system.pop());
        System.out.println(system.peek());
        System.out.println(system);
    }
}
