class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (!hs.add(num)) {
                hs.remove(num);
            }
        }
        int[] result = new int[2];
        int idx = 0;
        for (int num : hs) {
            result[idx++] = num;
        }
        return result;
    }
}