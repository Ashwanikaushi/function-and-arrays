import java.util.*;
public  class arrayIntro{
    public static void arrayIntro(){
        int arr[] = new int[5];
        // index = 0,1,2,3,4

        arr[0] = 98;
        arr[2] = 76;
        arr[4] = 87;
    // for access 
    // 1. for loop
     for(int i = 0; i< arr.length; i++){
        int value = arr[i];
        System.out.println(i+" "+value);
     }
      System.out.println("---------------");
      // 2. while loop 
      int i = 0;
      while(i!=0){
         int value = arr[i];
        System.out.println(i+" "+value);
        i++;
      }
      // 3. Arrays.toString method
      System.out.println("---------------");
      System.out.println(Arrays.toString(arr));
      // 4. for-each loop
      for(int value : arr ){
        System.out.println(value);
      }
       System.out.println("---------------");
    }
    public static void main(String[] args){
        arrayIntro();
    }
}