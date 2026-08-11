class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        Set<Integer> a=new HashSet<>(n);
        for (int num : nums)
            a.add(num);
        int sum=nums[0];
        for (int i=1;i<n;i++) 
        {
            if (nums[i]==nums[i-1]+1)
                sum+=nums[i];
            else break;
        }
        while (a.contains(sum))
            sum++;
        return sum;
    }
}