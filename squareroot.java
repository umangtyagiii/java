import java.util.*;
public class squareroot {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a perfect square : ");
        int n = obj.nextInt();
        System.out.println("Squareroot: "+ root(n));
    }
    public static int root(int n){
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid >n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
