class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        int cnt = 0,prev = nums[0],prev1 = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++){
            cnt = Math.max(prev1,nums[i]+prev);
            prev = prev1;
            prev1 = cnt;
        }
        return prev1;
    }
}
