import java.io.*;
import java.util.*;

public class findelement{

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // length
    int arr[] = new int[n];// arr
    for(int idx =0; idx <n; idx++){
        arr[idx] = scn.nextInt(); // array input
    }
    int ele = scn.nextInt(); // element

    int ans = findelement(arr,ele);
    System.out.println(ans);
    
 }
 public static int findelement(int arr[], int ele){
     
     for(int idx = 0; idx<arr.length; idx++){
         if(arr[idx]==ele){
             return idx; // element found
         }
     }
     return -1; // element not found
 }

}