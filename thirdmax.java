class Solution {
    public int thirdMax(int[] nums) {
    long max1=Long.MIN_VALUE;
    long max2=Long.MIN_VALUE;
    long max3=Long.MIN_VALUE; 
    for(int i=0; i<nums.length; i++){
        if(nums[i] == max1 || nums[i]==max2 || nums[i]==max3)continue;
        if(max1==Long.MIN_VALUE || nums[i]> max1){
            max3=max2;
            max2=max1;
            max1=nums[i];
        }else if(max2==Long.MIN_VALUE || nums[i]>max2){
            max3=max2;
            max2=nums[i];
        }else if(max3==Long.MIN_VALUE || nums[i]>max3){
            max3=nums[i];
        }
    }
        return max3==Long.MIN_VALUE ?(int)max1 : (int)max3;
    }
}