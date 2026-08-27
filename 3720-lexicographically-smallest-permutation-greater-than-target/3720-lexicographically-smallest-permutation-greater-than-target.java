class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length(), lastGood = -1;
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int[] tmp = count.clone();

        for (int i = 0; i < n; i++) {
            int t = target.charAt(i) - 'a';
            for (int c = t + 1; c < 26; c++) {
                if (tmp[c] > 0) {
                    lastGood = i;
                    break;
                }
            }
            if (tmp[t] > 0) {
                tmp[t]--;
            } else {
                break;
            }
        }
        if (lastGood == -1) {
            return "";
        }

        char[] res = new char[n];
        for (int i = 0; i < lastGood; i++) {
            res[i] = target.charAt(i);
            count[res[i] - 'a']--;
        }

        int t = target.charAt(lastGood) - 'a';
        int ch = -1;
        for (int c = t + 1; c < 26; c++) {
            if (count[c] > 0) {
                ch = c;
                break;
            }
        }
        res[lastGood] = (char) ('a' + ch);
        count[ch]--;

        int idx = lastGood + 1;
        for (int c = 0; c < 26; c++) {
            while (count[c] > 0) {
                res[idx++] = (char) ('a' + c);
                count[c]--;
            }
        }
        return new String(res);
    }
}