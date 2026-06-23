class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences) {
            int count = 0;
            for(char ch : s.toCharArray()) {
                if(ch == ' ') {
                    count++;
                }
            }
            // words = spaces + 1
            int words = count + 1;
            max = Math.max(max, words);
        }
        return max;
    }
}