import java.util.*;
public class prime {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = obj.nextInt();
        if(primecheck(n)){
            System.out.println("The number is prime!");
        }
        else{
            System.out.println("The number is not prime!");
        }
    }
    public static boolean primecheck(int n){
        if(n<2){
            return false;
        }
        int c = 2;
        while(c*c <=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
