class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        if(nums.length==1){
            return nums[0];
        }
        
        for(int i:nums){
            if(h.containsKey(i)){
                int count=h.get(i);
                count++;
                h.put(i,count);
                if(count>nums.length/2){
                    return i;
                }
                }else{
                h.put(i,1);
            }
        }
        return 0;
    }
}