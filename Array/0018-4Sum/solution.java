class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        Set<List<Integer>> h = new HashSet<>();

        for(int i = 0; i < nums.length - 3; i++) {

            for(int j = i + 1; j < nums.length - 2; j++) {

                int k = j + 1;
                int l = nums.length - 1;

                while(k < l) {

                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target) {

                        List<Integer> t = new ArrayList<>();

                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add(nums[l]);

                        h.add(t);

                        k++;
                        l--;
                    }

                    else if(sum > target) {
                        l--;
                    }

                    else {
                        k++;
                    }
                }
            }
        }

        return new ArrayList<>(h);
    }
}