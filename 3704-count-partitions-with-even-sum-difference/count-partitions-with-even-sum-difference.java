class Solution {
    public int countPartitions(int[] nums) {
        int total=Arrays.stream(nums).sum();
        return (total&1)==0?nums.length-1:0;
    }
}