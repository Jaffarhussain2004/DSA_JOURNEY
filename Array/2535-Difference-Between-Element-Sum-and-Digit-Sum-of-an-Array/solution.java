class Solution {
    public int differenceOfSum(int[] nums) {
    int eleSum=0;
    int digSum=0;

    for(int ele:nums){
        eleSum+=ele;
        while(ele>0){
            int rem=ele%10;
            digSum+=rem;
            ele=ele/10;
        }
    }    
    return Math.abs(eleSum-digSum);
    }
}