import java.util.*;
public class oop1wrapper {
    public static void main(String [] args){
        Integer x = 20;
        int a = 30;
        int b = 40;
        swap(a,b);
    }
    public static void swap(int a, int b){
        System.out.println(a+" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
