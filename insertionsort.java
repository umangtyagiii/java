import java.util.Arrays;
import java.util.Scanner;
public class insertionsort {
    public static void main(String []args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of unsorted array:");
        int n = obj.nextInt();
        System.out.println("Enter unsorted array of size " +n+":");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("The sorted array is: "+Arrays.toString(insertionsort(arr, n)));
    }
    public static int[] insertionsort(int  arr[], int n){
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(arr[j]>arr[j-1]){
                    break;
                }
                else{
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

}
