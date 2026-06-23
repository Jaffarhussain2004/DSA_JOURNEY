class Solution {
    public String removeStars(String s) {
        char[] a=s.toCharArray();
        LinkedList<Character> l=new LinkedList<>();
        for(char i:a){
            if(!l.isEmpty() && i == '*'){
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