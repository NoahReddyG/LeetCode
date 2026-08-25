class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> x=new HashSet<>();
        for (int num:nums) 
        {
            x.add(num);
        }
        int cur=k;
        while (x.contains(cur)) 
        {
            cur+=k;
        }
        return cur;
    }
}