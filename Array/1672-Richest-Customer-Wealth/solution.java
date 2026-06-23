class Solution {
    public int maximumWealth(int[][] accounts) {
       int maxValue=0;
       for(int i=0;i<=accounts.length-1;i++){
        int sum=0;
        for(int j=0;j<=accounts[i].length-1;j++){
            sum+=accounts[i][j];
        }
        maxValue=Math.max(maxValue,sum);
       }
       return maxValue;
    }
}