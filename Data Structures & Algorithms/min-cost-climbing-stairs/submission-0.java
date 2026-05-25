class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int curr = cost[i] + Math.min(prev, prev1);
            prev = prev1;
            prev1 = curr;
        }

        return Math.min(prev, prev1);
    }
}
