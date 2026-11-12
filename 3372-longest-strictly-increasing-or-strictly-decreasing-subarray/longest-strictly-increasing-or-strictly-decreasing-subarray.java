class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int a=1,u=1,d=1;
        for (int i=1;i<nums.length;i++) 
        {
            u=nums[i-1]<nums[i]?u+1:1;
            d=nums[i-1]>nums[i]?d+1:1;
            a=Math.max(a,Math.max(u,d));
        }
        return a;
    }
}