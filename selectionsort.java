import java.util.*;
public class selectionsort {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of unsorted array:");
        int n = obj.nextInt();
        System.out.println("Enter unsorted array of size " +n+":");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("The sorted array is: "+Arrays.toString(selectionsort(arr, n)));
    }
    public static int[] selectionsort(int  arr[], int n){
        for(int i=0; i<n-1; i++){
            int max = 0;
            int p=n-i-1;
            for(int j=0; j<n-i; j++){
                if(arr[j]>max){
                    max = arr[j];
                    p=j;
                }
            }
            int temp = arr[n-i-1];
            arr[n-i-1]=arr[p];
            arr[p] = temp;
        }
        return arr;
    }
}

