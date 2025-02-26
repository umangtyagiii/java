import java.util.Scanner;
public class patterns2 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = obj.nextInt();
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                int x = Math.min(j, 2*n-j);
                int y = Math.min(i, 2*n-i);
                System.out.print(n+1- Math.min(x,y));
            }
            System.out.println("");
        }
    }
}
