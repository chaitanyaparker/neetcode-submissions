class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, left = 0, right = k, n = arr.length, cnt = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        if((sum/k) >= threshold){
            cnt++;
        } else {
            cnt = 0;
        }
        while(right < n){
            sum += arr[right];
            sum -= arr[left];
            if((sum/k) >= threshold) cnt++;
            right++;
            left++;
        }
        return cnt;
    }
}