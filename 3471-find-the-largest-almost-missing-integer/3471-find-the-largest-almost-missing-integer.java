class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;
        for (int x : nums) {
            if (x <= ans) {
                continue;
            }
            int count = 0;
            for (int i = 0; i + k <= n; i++) {
                for (int j = i; j < i + k; j++) {
                    if (nums[j] == x) {
                        count++;
                        break;
                    }
                }
                if (count > 1) {
                    break;
                }
            }
            if (count == 1) {
                ans = x;
            }
        } 

        return ans; 
    }
}