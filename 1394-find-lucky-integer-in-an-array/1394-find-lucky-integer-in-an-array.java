class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer, Integer> h= new HashMap<>();
       for(int i:arr){
        if(h.containsKey(i)){
            int count=h.get(i);
            count++;
            h.put(i,count);
        }else{
            h.put(i,1);
        }
       }
       int max=-1;
       for(int i:h.keySet()){
        if(i==h.get(i)){
            max=Math.max(max,i);
        }
       }
       return max;
    }
}