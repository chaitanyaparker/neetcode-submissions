class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int[] arr = new int[2];
        while(left <= right){
            if((nums[right] + nums[left]) == target){
                arr[0] = left+1;
                arr[1] = right+1;
                break;
            } else if((nums[right] + nums[left]) > target){
                right--;
            } else left++;
        }
        return arr;
    }
}
