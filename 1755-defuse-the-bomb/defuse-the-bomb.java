class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        if (k==0) 
        return new int[n];
        int i,j;
        if (k<0) 
        {
            i=(n+k)%n;
            j=n-1;
        } 
        else 
        {
            i=1;
            j=k;
        }
        int sum=0;
        for (int y=i;y<=j;y++) 
        sum+=code[y];
        int ans[]=new int[n];
        for (int x=0;x<n;x++) 
        {
            ans[x]=sum;
            sum-=code[i];
            i=(i+1)%n;
            j=(j+1)%n;
            sum+=code[j];
        }
        return ans;
    }
}