class Solution {
    public int countElements(int[] arr) {
        int cnt = 0;
        Set<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);
        for (int x : arr) {
            if (set.contains(x + 1)) {
                cnt++;
            }
        }
        return cnt;
    }
}