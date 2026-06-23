class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums){
            h.add(i);
        }
        for(int i:h){
            a.add(i);
        }
        if(a.size()<3){
            return a.get(a.size()-1);
        }
        Collections.sort(a);
        return a.get(a.size()-3);
    }
}