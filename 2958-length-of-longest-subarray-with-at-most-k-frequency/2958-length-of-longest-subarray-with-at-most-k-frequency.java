class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, ans = 0;
        for (int right = 0; right < nums.length; right++) {
            int c = count.getOrDefault(nums[right], 0);
            count.put(nums[right], c + 1);

            while (count.get(nums[right]) > k) {
                int leftVal = nums[left];
                count.put(leftVal, count.get(leftVal) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}