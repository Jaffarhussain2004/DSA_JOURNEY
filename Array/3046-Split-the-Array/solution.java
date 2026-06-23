class Solution {
    public boolean isPossibleToSplit(int[] nums) {
      HashMap<Integer,Integer> h=new HashMap<>();
      int count=0;
      for(int i:nums){
        if(h.containsKey(i)){
            count=h.get(i);
            count++;
            h.put(i,count);
            if(count>2){
                return false;
            }
        }else{
            h.put(i,1);
        }
      }  
      return true;
    }
}