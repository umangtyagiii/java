import java.util.Scanner;
public class switch_statements {
    public static void main(String[] args) {
        int a,b,ch;
        System.out.println("Enter two numbers and case :");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        ch = obj.nextInt();
        obj.close();
        switch(ch)
        {
            case 1: System.out.println("Sum: " + (a+b));
            break;
            case 2: System.out.println("Difference: " + (a-b));
            break;
            case 3: System.out.println("Product: " + (a*b));
            break;
            case 4: System.out.println("Division: " + (a/b));
            break;
            default: System.out.println("Invalid");
        }

    }
}
