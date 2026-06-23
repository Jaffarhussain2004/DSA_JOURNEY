class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet h=new HashSet();
        for(int x:nums){
                h.add(x);
        }
        int i=1;
        while(true){
            if(!h.contains(i)){
                return i;
            }
            i++;
        }
        
    }
}