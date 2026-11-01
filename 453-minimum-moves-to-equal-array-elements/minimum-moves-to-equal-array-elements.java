class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for (int i:nums) 
        if (i<min) 
        min=i;
        long move=0;
        for (int i:nums) 
        move+=i-min;
        return (int) move;
    }
}