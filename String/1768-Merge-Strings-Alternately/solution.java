class Solution {
    public String mergeAlternately(String a, String b) {
        String c="";
        int i=0;
        int j=0;
        int pick=0;
        while(i<=a.length()-1 && j<=b.length()-1){
            if(pick==0){
                c=c+a.charAt(i);
                i=i+1;
                pick=1;
            }else{
                c=c+b.charAt(j);
                j++;
                pick=0;
            }
        }
        while(i<=a.length()-1){
            c=c+a.charAt(i);
            i++;
        }
        while(j<=b.length()-1){
            c=c+b.charAt(j);
            j++;
        }
        return c;
    }
}