class Solution {
    public int numSpecial(int[][] mat) {
       int r=mat.length;
       int c=mat[0].length;
       int R[]=new int[r];
       int C[]=new int[c];
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            if(mat[i][j]==1)
            {
                R[i]++;
                C[j]++;
            }
        }
       }
       int res=0;
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            if(mat[i][j]==1 && R[i]==1 && C[j]==1)
            res++;
        } 
    }
    return res;
}
}