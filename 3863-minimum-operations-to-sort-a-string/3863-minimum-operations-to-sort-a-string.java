class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        boolean sorted = true;
        char min = a[0], max = a[0];
        for (int i = 0; i < n; i++) {
            min = (char) Math.min(min, a[i]);
            max = (char) Math.max(max, a[i]);
            if (i > 0 && a[i] < a[i - 1]) {
                sorted = false;
            }
        }
        if (sorted) return 0;
        if (n == 2) return -1;
        if (a[0] == min || a[n - 1] == max) {
            return 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (a[i] == min || a[i] == max) {
                return 2;
            }
        }
        return 3;
    }
}
