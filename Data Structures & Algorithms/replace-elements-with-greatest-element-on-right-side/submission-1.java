class Solution {
    public int[] replaceElements(int[] arr) {
        int high = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = high;          

            if (current > high) {   
                high = current;
            }
        }

        return arr;
    }
}