class Solution {
    public int countDigits(int num) {
        int i;
        int count=0;
        int dup=num;
        while(num>0){
            int rem=num%10;
            if(rem!=0 && dup%rem==0){
                count++;
            }
            num=num/10;
        }
        return count;
        }
}