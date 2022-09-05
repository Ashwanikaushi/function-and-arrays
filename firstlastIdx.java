import java.io.*;
import java.util.*;

public class firstlastIdx{

public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        int k = scn.nextInt();
       
        System.out.println(firstIdx(arr, k));
        System.out.println(lastIdx(arr, k));
    }
    public static int firstIdx(int arr[], int k){
        int left = 0, right = arr.length-1;
        int firstIdx= -1;
        while(left<= right){
            int mid = (left + right)/2; 
            
            if(arr[mid]==k){
                firstIdx= mid;
                right = mid - 1;
            }else if(k> arr[mid]){
                left = mid+1;
            }else if(k< arr[mid]){
                right = mid-1; 
            }
        }
        return firstIdx;
    }
    public static int lastIdx(int arr[], int k){
        int left = 0, right = arr.length-1;
        int lastIdx= -1;
        while(left<= right){
            int mid = (left + right)/2; 
            
            if(arr[mid]==k){
                lastIdx= mid;
                left = mid + 1;
            }else if(k> arr[mid]){
                left = mid+1;
            }else if(k< arr[mid]){
                right = mid-1; 
            }
        }
        return lastIdx;
    }
 }

