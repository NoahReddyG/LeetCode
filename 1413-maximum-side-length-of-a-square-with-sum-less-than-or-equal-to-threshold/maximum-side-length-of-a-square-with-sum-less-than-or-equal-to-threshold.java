class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] prefixSum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = mat[i-1][j-1]+prefixSum[i-1][j]+prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }
        int low =1, high=Math.min(m,n);
        int result=0;
        while (low<=high) 
        {
            int mid=low+(high-low)/2;
            if (hasSquareWithSide(prefixSum, mid, threshold)) 
            {
                result=mid; // This side length works, try larger
                low=mid+1;
            } 
            else 
            {
                high=mid-1; // Too large, try smaller
            }
        }

        return result;
    }

    private boolean hasSquareWithSide(int[][] sum, int k, int threshold) {
        int m=sum.length-1;
        int n=sum[0].length-1;
        for (int i=k;i<=m;i++) 
        {
            for (int j=k;j<=n;j++) 
            {
                int currentSum=sum[i][j]-sum[i-k][j]-sum[i][j-k]+sum[i-k][j-k];
                if (currentSum<=threshold) 
                {
                    return true;
                }
            }
        }
        return false;
    }
}