import java.util.*;
public class binarysearch {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = obj.nextInt();
        System.out.println("Enter increasing array of "+ n + " size:");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter target:");
        int k = obj.nextInt();
        int start = 0;
        int end = n-1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<k){
                start = mid+1;
            }
            else if(arr[mid]>k){
                end = mid-1;
            }
            else{
                index = mid;
                break;
            }
        }
        System.out.println("The " + n+ " element is found at index "+ index);
        obj.close();
    }
}
