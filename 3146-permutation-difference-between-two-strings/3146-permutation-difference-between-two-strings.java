class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] posInS = new int[26];
        for (int i = 0; i < s.length(); i++) {
            posInS[s.charAt(i) - 'a'] = i;
        }
        
        int diff = 0;
        for (int j = 0; j < t.length(); j++) {
            diff += Math.abs(posInS[t.charAt(j) - 'a'] - j);
        }
        
        return diff;
    }
}