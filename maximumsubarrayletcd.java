class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int sp = 0; sp<nums.length; sp++){
            int subArraySum = 0;
        for(int ep = sp; ep< nums.length; ep++){
           subArraySum += nums[ep];
            // System.out.println("sp" + "ep" + "sum :" +subArraySum);
            max = Math.max(max,subArraySum);
    }
        }
        return max;
    }
}