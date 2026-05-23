class Solution {
    public boolean check(int[] nums) {
        boolean flag=false;
        int l=nums.length;
        for (int i=0;i<l;i++) 
        {
            if (nums[i]>nums[(i+1)%l]) 
            {
                if(flag) 
                return false;
                flag=true;
            }
        }
        return true;
    }
}