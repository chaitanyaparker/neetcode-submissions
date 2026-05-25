class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        while(i<n){
            if(nums[i] % 2 != 0) i++;
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        return nums;
    }
}