class Solution {
    public boolean canAliceWin(int[] nums) {
     int totalSum=0;
     int singleSum=0;
     int doubleSum=0;
     for(int num:nums){
        totalSum+=num;
     if(num>10){
        doubleSum+=num;
     }
     if(num<10){
        singleSum+=num;
     }
     }
     int bobSingleSum=totalSum-doubleSum;
     int bobDoubleSum=totalSum-singleSum;
     return (singleSum>bobDoubleSum) || (doubleSum>bobSingleSum);
    }
}