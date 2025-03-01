import java.util.*;
public class recursion_patterns {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = obj.nextInt();
        triangle(n,0);
    }
    public static void triangle(int r, int c){
        if(r==0){
            return;
        }
        else if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else{
            System.out.println("");
            triangle(r-1,0);
        }
    }
}
