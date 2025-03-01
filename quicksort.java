import java.util.*;
public class quicksort {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of unsorted array:");
        int n = obj.nextInt();
        System.out.println("Enter unsorted array of size " +n+":");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        qsort(arr, 0 , arr.length-1);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
    public static void qsort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        qsort(arr, low, e);
        qsort(arr,s,high);
    }
}
