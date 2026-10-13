class Solution {
    public long maxAlternatingSum(int[] nums) {
        long x[]=new long[nums.length];
        for(int i=0;i<nums.length;i++)
        x[i]=(long)nums[i]*nums[i];
    Arrays.sort(x);
    long ans=0;
    int y=nums.length/2;
    for(int i=0;i<y;i++)
    ans-=x[i];
    for(int i=y;i<nums.length;i++)
    ans+=x[i];
    return ans;
    }
}