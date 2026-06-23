class Solution {
    public String reverseWords(String s) {
      String str=s.trim();
      //splitting
      String[] splitString=str.split("\\s+");
      //adding in list
      List<String> ListStr=Arrays.asList(splitString);
      //reverse
      Collections.reverse(ListStr);
      return String.join(" ",ListStr);  
    }
}