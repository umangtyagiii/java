import java.util.Scanner;
/**
 * arithmetic
 */
public class arithmetic_operators {
    public static void main(String[] args) {
        int a,b;
        System.err.println("Enter data");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        obj.close();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println("Sum: " +c);
        System.out.println("Difference: " +d);
        System.out.println("Product: " +e);
        System.out.println("Difference: " +f);
        System.out.println("Remainder: " +g);
    }
}