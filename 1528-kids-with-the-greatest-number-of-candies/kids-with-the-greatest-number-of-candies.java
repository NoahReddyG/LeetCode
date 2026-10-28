class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int m=0;
        for(int i=0;i<n;i++)
        {
        m=Math.max(m,candies[i]);
        }
        ArrayList<Boolean> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(candies[i]+extraCandies>=m)
            res.add(true);
            else
            res.add(false);
        }
        return res;
    }
}