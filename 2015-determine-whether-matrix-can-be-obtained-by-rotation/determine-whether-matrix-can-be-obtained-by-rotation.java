class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int l=mat.length;
        for(int i=0;i<4;i++)
        {
            if(areEqual(mat, target))
            return true;
            for(int j=0;j<l;j++)
            {
                for(int k=j;k<l;k++)
                {
                    int temp=mat[j][k];
                    mat[j][k]=mat[k][j];
                    mat[k][j]=temp;
                }
            }
            for(int j=0;j<l;j++)
            {
                reverse(mat[j]);
            }
        }
        return false;
    }
    static boolean areEqual(int a[][], int b[][])
    {
        int l=a.length;
        for(int i=0;i<l;i++)
        {
            if(!Arrays.equals(a[i],b[i]))
            return false;
        }
        return true;
    }
        static void reverse(int arr[])
        {
            int left=0;
            int right=arr.length-1;
            while(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }