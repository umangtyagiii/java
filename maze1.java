import java.util.*;
public class maze1 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = obj.nextInt();
        int c = obj.nextInt();
        System.out.println("Total ways: "+ count(r,c));
    }
    public static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1 , c);
        int right = count(r, c-1);
        return left + right;
    }
    
}
