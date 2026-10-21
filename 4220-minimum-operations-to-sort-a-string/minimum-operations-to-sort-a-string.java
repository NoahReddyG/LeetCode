class Solution {
    public int minOperations(String s) {
        int n=s.length();
        boolean sort=true;
        for (int i=1;i<n;++i) 
        {
            if (s.charAt(i)<s.charAt(i-1)) 
            {
                sort=false;
                break;
            }
        }
        if (sort) 
        return 0;
        if (n==2) 
        return -1;
        char mn=s.charAt(0), mx=s.charAt(0);
        for (int i=1;i<n;++i) 
        {
            char ch=s.charAt(i);
            if (ch<mn) 
            mn=ch;
            if (ch>mx) 
            mx=ch;
        }
        if (s.charAt(0)==mn||s.charAt(n-1)==mx) 
        return 1;
        for (int i=1;i<n-1;++i)
        {
            char ch=s.charAt(i);
            if (ch==mn||ch==mx) 
            return 2;
        }
        return 3;
    }
}