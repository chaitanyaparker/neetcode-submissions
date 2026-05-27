class Solution {
    public int maxProductDifference(int[] nums) {
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;

        int big1 = Integer.MIN_VALUE;
        int big2 = Integer.MIN_VALUE;

        for (int num : nums) {

            if (num < small1) {
                small2 = small1;
                small1 = num;
            } else if (num < small2) {
                small2 = num;
            }

            if (num > big1) {
                big2 = big1;
                big1 = num;
            } else if (num > big2) {
                big2 = num;
            }
        }

        return (big1 * big2) - (small1 * small2);
    }
}