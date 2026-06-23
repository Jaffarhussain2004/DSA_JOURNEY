class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        for(int i=0;i<=nums.length-1;i++){
            sum=sum+nums[i];
        }
        return expectedSum-sum;
    }
}