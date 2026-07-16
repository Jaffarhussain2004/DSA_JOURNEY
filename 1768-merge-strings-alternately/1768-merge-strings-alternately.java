class Solution {
    public String mergeAlternately(String a, String b) {
        String c="";
        int i=0;
        int j=0;
        int pick=0;
        while(i<a.length() && j<b.length()){
            if(pick==0){
                c=c+a.charAt(i);
                i++;
                pick=1;
            }else{
                c=c+b.charAt(j);
                j++;
                pick=0;
            }
        }

        while(i<a.length()){
            c=c+a.charAt(i);
            i++;
        }
        while(j<b.length()){
            c=c+b.charAt(j);
            j++;
        }
        return c;
    }
}