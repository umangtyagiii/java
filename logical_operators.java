import java.util.Scanner;
public class logical_operators {
    public static void main(String[] args) {
        int a,b;
        System.out.println(" Enter two numbers: ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        obj.close();
        System.out.println((a>b) && (b<a)); //logical and: both need to be true
        System.out.println((a>b) && (b>a)); 
        System.out.println((a<b) && (b>a)); 
        System.out.println((a>b) || (b<a)); //logical or: any one to be true
        System.out.println((a>b) || (b>a)); 
        System.out.println((a<b) || (b>a)); 
        System.out.println(!(a>b)); //logical not: opposite result
    }
}
