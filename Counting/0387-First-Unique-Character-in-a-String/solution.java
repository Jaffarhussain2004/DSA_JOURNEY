class Solution {
    public int firstUniqChar(String s) {
        char[] s1=s.toCharArray();
        HashMap<Character,Integer> h=new HashMap<>();
        for(char i:s1){
            if(h.containsKey(i)){
                int count=h.get(i);
                count++;
                h.put(i,count);
            }else{
                h.put(i,1);
            }
        }
        for(int i=0;i<=s1.length-1;i++){
            if(h.get(s1[i])==1){
                return i;
            }
        }
        return -1;
    }
}