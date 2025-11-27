class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        final long n=nums.length;
        final long INF=Long.MAX_VALUE/2;
        long min[]=new long[k];
        for(int i=0;i<k-1;i++)
        min[i]=INF;
        min[k-1]=0;
        long pre=0, ans=-INF;
        for(int i=0;i<n;i++)
        {
            pre+=nums[i];
            int ik=i%k;
            ans=Math.max(ans, pre-min[ik]);
            min[ik]=Math.min(pre,min[ik]);
        }
        return ans;
    }
}