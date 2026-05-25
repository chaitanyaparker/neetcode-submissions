class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        int t1 = 1, t2 = 1, t3 = 0;
        for(int i = 2; i < n; i++){
            int curr = t1 + t2 + t3;
            t3 = t2;
            t2 = t1;
            t1 = curr;
        }
        return t1;
    }
}