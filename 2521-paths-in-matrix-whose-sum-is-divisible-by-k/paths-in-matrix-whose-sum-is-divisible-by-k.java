class Solution {
    private static final int MOD = (int) 1e9 + 7;
    public int numberOfPaths(int[][] grid, int k) 
    {
        int m=grid.length, n=grid[0].length;
        int prev[][]=new int[n][k];
        int curr[][]=new int[n][k];
        int sum=0;
        for (int j=0;j<n;j++) 
        {
            sum=(sum+grid[0][j])%k;
            prev[j][sum]=1;
        }
        sum=grid[0][0]%k;
        for (int i=1;i<m;i++) 
        {
            sum=(sum+grid[i][0])%k;
            Arrays.fill(curr[0],0);
            curr[0][sum]=1;
            for (int j=1;j<n;j++) 
            {
                Arrays.fill(curr[j],0);
                int val=grid[i][j];

                for (int x=0;x<k;x++) 
                {
                    int y=(x+val)%k;
                    curr[j][y]=(prev[j][x]+curr[j-1][x])%MOD;
                }
            }
            int tmp[][]=prev;
            prev=curr;
            curr=tmp;
        }
        return prev[n-1][0];
    }
}