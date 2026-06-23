class Solution {
    public int maxSubArray(int[] nums) {
        int psum=0;
        int subMax=nums[0];
        for(int i:nums){
            psum=Math.max(psum+i,i);
            subMax=Math.max(subMax,psum);
        }
        return subMax;
    }
}