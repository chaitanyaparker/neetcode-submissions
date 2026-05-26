class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!hash.containsKey(ch)) return false;

            hash.put(ch, hash.get(ch) - 1);

            if (hash.get(ch) < 0) return false;
        }

        return true;
    }
}