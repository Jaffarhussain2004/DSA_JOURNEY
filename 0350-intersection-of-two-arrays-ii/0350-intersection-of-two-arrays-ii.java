class Solution {
    public int[] intersect(int[] num1, int[] num2) {
        HashMap<Integer, Integer> h=new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        int count=0;
        for(int i:num1){
            if(h.containsKey(i)){
                count=h.get(i);
                count++;
                h.put(i,count);
            }else{
                h.put(i,1);
            }
        }
        for(int j:num2){
            if(h.containsKey(j) && h.get(j)>0){
                l.add(j);
                h.put(j,h.get(j)-1);
            }
        }
        int[] res=new int[l.size()];
        for(int k=0;k<l.size();k++){
            res[k]=l.get(k);
        }
        return res;
    }
}