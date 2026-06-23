class Solution {
    public int heightChecker(int[] h) {
      int[] res=new int[h.length];
      for(int i=0;i<=res.length-1;i++){
        res[i]=h[i];
      }
      Arrays.sort(res);
      int count=0;
      for(int i=0;i<=h.length-1;i++){
        if(h[i]!=res[i]){
            count++;
        }
      }


      return count;
    }
}