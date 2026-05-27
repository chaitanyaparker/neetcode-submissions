class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(hash.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i).getKey();
        }

        return arr;
    }
}