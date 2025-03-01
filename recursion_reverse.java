import java.util.*;
public class recursion_reverse {
    static int sum = 0;
    public static void rev(int n){
        
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev(n/10);
    }
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = obj.nextInt();
        rev(n);
        System.out.println("Reverse: "+ sum);
    }
    
}
