class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] s=sentence.toCharArray();
        HashSet h=new HashSet();
        for(char i:s){
            if(h.contains(i)){
                h.add(i);
            }else{
                h.add(i);
            }
        }
        if(h.size()==26){
            return true;
        }
        return false;
    }
}