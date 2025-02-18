
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int a,b;
        System.err.println("Enter data");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        obj.close();

        System.out.println("Get data " +a+ " " +b);
    }
}
