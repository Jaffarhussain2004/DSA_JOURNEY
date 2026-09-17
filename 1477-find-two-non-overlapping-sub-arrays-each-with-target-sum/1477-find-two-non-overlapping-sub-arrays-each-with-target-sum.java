class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++)
            dp[i] = 1000000;
        int sum = 0, left = 0;
        int best = 1000000;
        int ans = 1000000;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > target)
                sum -= arr[left++];
            if (sum == target) {
                int len = right - left + 1;
                if (dp[left] != 1000000)
                    ans = Math.min(ans, len + dp[left]);

                best = Math.min(best, len);
            }
            dp[right + 1] = best;
        }
        return ans == 1000000 ? -1 : ans;
    }
}