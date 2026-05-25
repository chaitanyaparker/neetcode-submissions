class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if(s.length() > t.length()) return false;
        int left = 0,right = 0;
        while(right < t.length()){
            if(left == s.length()-1) return true;
            if(s.charAt(left) == t.charAt(right)){
                left++;
            }
            right++;
        }
        return false;
    }
}