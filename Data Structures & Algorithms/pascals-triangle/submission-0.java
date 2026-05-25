class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if (numRows == 0) return list;

        if (numRows == 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            list.add(row);
            return list;
        }

        list = generate(numRows - 1);

        List<Integer> prev = list.get(numRows - 2);
        List<Integer> curr = new ArrayList<>();

        curr.add(1);
        for (int i = 1; i < numRows - 1; i++) {
            curr.add(prev.get(i - 1) + prev.get(i));
        }
        curr.add(1);

        list.add(curr);
        return list;
    }
}