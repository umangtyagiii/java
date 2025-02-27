import java.util.*;
public class bubblesort {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of unsorted array:");
        int n = obj.nextInt();
        System.out.println("Enter unsorted array of size " +n+":");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        obj.close();
        System.out.println("The sorted array is: "+Arrays.toString(bubblesort(arr, n)));
    }
    public static int[] bubblesort(int  arr[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
