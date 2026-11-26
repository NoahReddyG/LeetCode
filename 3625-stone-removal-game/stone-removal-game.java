class Solution {
    public boolean canAliceWin(int n) {
        int t=10,m=0;
        while(n>=t) 
        {
            n-=t;
            t--;
            m++;
        }
        return m%2==1;
    }
}