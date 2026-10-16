class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
      int[] a=new int[num1.length+num2.length];
      int k=0;
      for(int x:num1){
        a[k]=x;
        k++;
      }
      for(int x:num2){
        a[k]=x;
        k++;
      }

      Arrays.sort(a);
    
      int i=0;
      int j=a.length-1;
      while(i<j){
        i++;
        j--;
      }
      if(i==j){
        return a[i]*1.0;
      }else{
        return (a[i]+a[j])/2.0;
      }
    }
}