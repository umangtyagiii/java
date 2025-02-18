import java.util.Scanner;

/**
 * odd_even
 */
public class odd_even {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter number: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        if(n%2 == 0){
            System.out.println("Entered number is even!");
        }
        else{
            System.out.println("Entered number is odd!");
        }
    }
}