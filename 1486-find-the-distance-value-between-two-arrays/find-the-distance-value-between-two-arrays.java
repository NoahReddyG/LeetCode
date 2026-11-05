class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int x[]=Arrays.copyOf(arr2, arr2.length+1);
        x[arr2.length]=Integer.MAX_VALUE;
        Arrays.sort(x);
        Arrays.sort(arr1);
        int count=0,j=0;
        for(int i:arr1) 
        { 
            while(x[j]<i-d)
            j++;
            if(x[j]>i+d) 
            count++;
        }
        return count;
    }
}