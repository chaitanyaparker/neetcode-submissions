class Solution {
    public int singleNumber(int[] nums) {
        int total = 0;
        for(int i : nums){
            total ^= i;
        }   
        return total; 
    }
}
