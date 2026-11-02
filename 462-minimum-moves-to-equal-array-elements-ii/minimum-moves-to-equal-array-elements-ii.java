class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int m=nums[nums.length/2];
        long move=0;
        for (int i:nums) 
        {
            move+=Math.abs(i-m);
        }
        return (int) move;
    }
}