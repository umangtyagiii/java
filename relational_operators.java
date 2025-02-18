import java.util.Scanner;
public class relational_operators {
    public static void main(String[] args) {
        int a,b;
        System.out.println(" Enter two numbers: ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        obj.close();
        System.out.println("Result: " +(a<b));
        System.out.println("Result: " +(a>b));
        System.out.println("Result: " +(a<=b));
        System.out.println("Result: " +(a>=b));
        System.out.println("Result: " +(a==b));
        System.out.println("Result: " +(a!=b));
    }
}
