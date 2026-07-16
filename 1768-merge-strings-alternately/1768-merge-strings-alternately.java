class Solution {
    public String mergeAlternately(String a, String b) {
        StringBuilder s=new StringBuilder();
        int i=0;
        int j=0;
        while(i<a.length() && j<b.length()){
            s.append(a.charAt(i));
            i++;
            s.append(b.charAt(j));
            j++;
        }

        while(i<a.length()){
            s.append(a.charAt(i));
            i++;
        }
        while(j<b.length()){
            s.append(b.charAt(j));
            j++;
        }

        return s.toString();
    }
}