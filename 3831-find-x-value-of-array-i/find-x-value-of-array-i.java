class Solution {
    public long[] resultArray(int[] nums, int k) {
        long res[]=new long[k];
        int freq[]=new int[k];

        for (int n:nums) 
        {
            n%=k;
            int cur[]=new int[k];
            cur[n]=1;
            for (int i=0;i<k;i++)
                cur[i*n%k]+=freq[i];
            freq=cur;
            for (int i=0;i<k;i++)
                res[i]+=freq[i];
        }
        return res;
    }
}