import java.util.*;
public class binarySearch{
    public static boolean binarySearch(int arr[], int ele){
        int left = 0, right= arr.length-1;
        while(left <= right){
            int mid = (left +right)/2;
            if(ele == arr[mid]){
                return true;
            }else if(ele < arr[mid]){
                right = mid - 1;
            }else if(ele > arr[mid]){
                left = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        int ele = scn.nextInt();
        boolean res = binarySearch(arr, ele);
        System.out.println(res);
    }
}