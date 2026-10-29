class Solution {
    public int maxArea(int[] height) {
       int L=0;
       int R=height.length-1; 
       int area=0;
       while(L<R)
       {
        area=Math.max(area,(R-L)*Math.min(height[L],height[R]));
        if(height[L]<height[R])
        {
            L++;
        }
        else
        {
            R--;
        }
       }
       return area;
    }
} 