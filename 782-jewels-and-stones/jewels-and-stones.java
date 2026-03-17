class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(char i:jewels.toCharArray())
        {
            for(char j:stones.toCharArray())
            {
                if(i==j)
                c++;
            }
        }
        return c;
    }
}