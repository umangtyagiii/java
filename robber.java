import java.util.*;

public class robber {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array one by one: ");
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("The maximum sum is: " + rob(arr));
    }
    public static int rob(int[] arr){
        int n = arr.length;
        int brr[] = new int[n];
        brr[0] = arr[0];
        brr[1] = Math.max(arr[0], arr[1]);
        for(int i=2; i<n; i++){
            brr[i] = Math.max(arr[i]+brr[i-2], brr[i-1]);
        }
        return brr[n-1];
    }
}
