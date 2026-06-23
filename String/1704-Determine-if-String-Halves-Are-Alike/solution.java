class Solution {
    public boolean halvesAreAlike(String st) {
        st=st.toLowerCase();
        char[] s=st.toCharArray();
        int x=s.length/2;
        int count=0;
        for(int i=0;i<=s.length-1;i++){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'){
                if(i<x){
                    count++;
                }else{
                    count--;
                }
            }
        }
        if(count==0){
            return true;
        }else{
            return false;
        }
    }
}