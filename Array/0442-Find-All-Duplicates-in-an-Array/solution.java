class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(Integer i:nums){
            if(h.contains(i)){
                ans.add(i);
            }else{
                h.add(i);
            }
        }
        return ans;
    }
}