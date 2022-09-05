class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0; i< nums.length; i++){
            ans[i] =nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int p1 = 0, p2 = nums.length-1, idx = nums.length-1;
        while(p1<=p2){
            if(nums[p1]*nums[p1] >= nums[p2]*nums[p2]){
                ans[idx] = nums[p1]*nums[p1];
                p1++;
            }else{
                ans[idx]= nums[p2]*nums[p2];
                p2--;
            }
            idx--;
        }
        return ans;
    }
}