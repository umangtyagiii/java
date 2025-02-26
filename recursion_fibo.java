import java.util.*;
public class recursion_fibo {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = obj.nextInt();
        System.out.println("Fibonacci: "+ fibo(n));
    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
