class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     HashMap<Integer,Integer> h=new HashMap<>();
     ArrayList<Integer> a=new ArrayList<>();
     for(int i:nums){
        if(h.containsKey(i)){
            int count=h.get(i);
            count++;
            h.put(i,count);
        }else{
            h.put(i,1);
        }
     }
     for(int i=1;i<=nums.length;i++){
        if(!h.containsKey(i)){
            a.add(i);
        }
     }
     return a;
    }
}