import java.util.*;
public class cyclesort {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of unsorted array:");
        int n = obj.nextInt();
        System.out.println("Enter unsorted array of size " +n+":");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("The sorted array is: "+Arrays.toString(cyclesort(arr, n)));
    }
    public static int[] cyclesort(int  arr[], int n){
        int i=0;
        while(i<n){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
