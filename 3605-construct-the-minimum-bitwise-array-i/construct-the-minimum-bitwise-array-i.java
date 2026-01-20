class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int result[]=new int[nums.size()];
        for (int i=0;i<nums.size();i++)
        {
            int n=nums.get(i);
            if ((n&1)==1)
                result[i]=n&~(((n+1)&~n)>>1);
            else
                result[i]=-1;
        }
        return result;
    }
}
