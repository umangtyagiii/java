import java.util.*;
public class maze2 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = obj.nextInt();
        int c = obj.nextInt();
        count("",r,c);
    }
    public static void count(String p, int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            count(p+'D',r-1,c);
        }
        if(c>1){
            count(p+'R',r,c-1);
        }
    }
}
