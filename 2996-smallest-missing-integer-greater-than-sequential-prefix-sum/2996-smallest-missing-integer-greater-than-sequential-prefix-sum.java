import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int i = 1;
        while (i < n && nums[i] == nums[i - 1] + 1) {
            i++;
        }
        int x = 0;
        for (int j = 0; j < i; j++) {
            x += nums[j];
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(x)) {
            x++;
        }
        return x;
    }
}