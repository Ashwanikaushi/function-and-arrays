import java.io.*;
import java.util.*;

public class brokeneconomy{

public static void brokeneconomy(int arr[], int k){
        int left = 0, right= arr.length-1;
        int ceil = -1, floor = -1;
        while(left <= right){
            int mid = (left +right)/2;
            if(k == arr[mid]){
               ceil = floor = arr[mid];
            }
            else if(k < arr[mid]){
                right = mid - 1;
                ceil = arr[mid];
            }else if(k > arr[mid]){
                left = mid + 1;
                floor = arr[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
       int k = scn.nextInt();
       brokeneconomy(arr, k);
    }

}