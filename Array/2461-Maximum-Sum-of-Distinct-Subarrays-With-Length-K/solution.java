import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> h = new HashMap<>();

        long sum = 0;
        long max = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // Add current element to HashMap
            if (h.containsKey(nums[i])) {
                h.put(nums[i], h.get(nums[i]) + 1);
            } else {
                h.put(nums[i], 1);
            }

            // Remove element leaving the window
            if (i >= k) {

                sum -= nums[i - k];

                h.put(nums[i - k], h.get(nums[i - k]) - 1);

                if (h.get(nums[i - k]) == 0) {
                    h.remove(nums[i - k]);
                }
            }

            // Check if window size is k and all elements are distinct
            if (i >= k - 1 && h.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}