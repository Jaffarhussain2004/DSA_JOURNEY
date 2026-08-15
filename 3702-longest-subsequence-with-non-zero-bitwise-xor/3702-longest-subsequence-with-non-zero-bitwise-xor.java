class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xorAll = 0;
        int cntZero = 0;

        for (int x : nums) {
            xorAll ^= x;
            if (x == 0) cntZero++;
        }
        if (cntZero == n) return 0;     
        if (xorAll != 0) return n;       
        return n - 1;                    
    }
}