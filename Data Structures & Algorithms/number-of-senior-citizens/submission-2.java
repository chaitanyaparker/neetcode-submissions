class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;

        for (int i = 0; i < details.length; i++) {
            String info = details[i];

            int age = Integer.parseInt(info.substring(11, 13));

            if (age > 60) {
                cnt++;
            }
        }

        return cnt;
    }
}