import java.util.*;
public class oop1wrapper {
    public static void main(String [] args){
        Integer x = 20;
        swap(10,20);
        
    }
    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
