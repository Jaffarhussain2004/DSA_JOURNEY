class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[] suf = new int[n + 1];
        suf[n] = 0;
        int j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                j--;
            }
            suf[i] = m - 1 - j;
        }

        List<Integer> result = new ArrayList<>();
        int i = 0, jj = 0;
        boolean used = false;
        
        while (i < n && jj < m) {
            if (word1.charAt(i) == word2.charAt(jj)) {
                result.add(i);
                i++;
                jj++;
            } else if (!used && suf[i + 1] >= (m - 1 - jj)) {
                result.add(i);
                used = true;
                i++;
                jj++;
            } else {
                i++;
            }
        }
        if (jj < m) return new int[0];
        int[] ans = new int[result.size()];
        for (int k = 0; k < ans.length; k++) ans[k] = result.get(k);
        return ans;
    }
}