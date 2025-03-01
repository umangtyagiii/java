import java.util.*;
public class mergesort {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of unsorted array:");
        int n = obj.nextInt();
        System.out.println("Enter unsorted array of size " +n+":");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("The sorted array is: " + Arrays.toString(msort(arr)));
    }
    public static int[] msort(int [] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = msort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = msort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    public static int[] merge(int [] left, int [] right){
        int arr[] = new int[left.length + right.length];
        int l = 0; 
        int r=0;
        int k=0;
        while(l<left.length && r<right.length){
            if(left[l]<right[r]){
                arr[k]=left[l];
                l++;
            }
            else{
                arr[k]=right[r];
                r++;
            } 
            k++;
        }
        while(l<left.length){
            arr[k]=left[l];
            k++;
            l++;
        }
        while(r<right.length){
            arr[k]=right[r];
            k++;
            r++;
        }
        return arr;
    }
}
