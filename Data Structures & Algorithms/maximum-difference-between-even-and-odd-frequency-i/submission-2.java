class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        int diff = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                maxOdd = Math.max(maxOdd, entry.getValue());
            }
            if(entry.getValue() % 2 == 0){
                minEven = Math.min(minEven, entry.getValue());
            }
        }

        
        return maxOdd - minEven;
    }
}