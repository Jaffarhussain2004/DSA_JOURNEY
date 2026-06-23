class Solution {
    public int singleNumber(int[] n) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:n){
            if(h.containsKey(i)){
                int count=h.get(i);
                count++;
                h.put(i,count);
            }else{
                h.put(i,1);
            }
        }
        for(int i:h.keySet()){
            if(h.get(i)!=3){
                return i;
            }
        }
        return -1;
    }
}