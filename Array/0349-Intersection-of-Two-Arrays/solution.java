class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        for(int i:nums1){
                h1.add(i);
            }
            for(int i:nums2){
                if(h1.contains(i))
                h2.add(i);
            }
            int[] ans=new int[h2.size()];
            int x=0;
            for(int i:h2){
                ans[x]=i;
                x++;
            }
            return ans;
    }
}