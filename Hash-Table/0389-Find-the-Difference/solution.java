class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        int xor=0;
        for(char i:s1){
            xor=xor^i;
        }
        for(char i:t1){
            xor=xor^i;
        }
        return (char)(xor);
    }
}