class Solution {
    public String removeDuplicates(String s) {
        char[] s1=s.toCharArray();
        LinkedList<Character> l=new LinkedList<>();

        for(char i:s1){
            if(!l.isEmpty() && l.getLast()==i){
                l.removeLast();
            }else{
                l.addLast(i);
            }
        }
        String ans="";
        for(char i:l){
            ans=ans+i;
        }
        return ans;
    }
}