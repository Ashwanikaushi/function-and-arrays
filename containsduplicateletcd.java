class Solution {
    public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
        for(int idx =1; idx<nums.length; idx++){
            int curr = nums[idx], prev= nums[idx-1];
            if(curr == prev) return true;
        }
            return false;
            
       
    }
}