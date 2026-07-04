class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1=s.split(" ");
        HashMap<Character, String> h=new HashMap<>();
        if(pattern.length()!=s1.length){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            boolean containsKey=h.containsKey(ch);
                if(h.containsValue(s1[i]) && !containsKey){
                    return false;
                }
                else if(containsKey && !h.get(ch).equals(s1[i])){
                    return false;
                }
                else{
                    h.put(ch,s1[i]);
                }
        }
        return true;
    }
}