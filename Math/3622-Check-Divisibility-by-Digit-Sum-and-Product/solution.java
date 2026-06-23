class Solution {
    public boolean checkDivisibility(int n) {
        int dup=n;
        int sum=0;
        int prod=1;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem;
            prod=prod*rem;
        }
        int cal=sum+prod;
        if(dup%cal==0){
            return true;
        }
        return false;
    }
}