class Solution {
    public int search(int[] nums, int target) {
      int low=0;
      int high=nums.length-1;
      if(nums.length==1){
        return nums[0]==target?0:-1;
      }
      while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
      }
      return -1;
    }
}