import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("Enter value:");
        
        n = obj.nextInt();
        obj.close();
        while(n>=100){
            System.out.println("Yayyy");
        } //infinity case


        int m = 1;
        while(m<=10){
            System.out.println("Yayyy");
            m++; 
        } //repetition case
    }
}
