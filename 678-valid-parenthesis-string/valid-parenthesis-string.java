class Solution {
    public boolean checkValidString(String s) {
        int x=0,y=0;
        for (int i=0;i<s.length();i++) 
        {
            x+=s.charAt(i)=='('?1:-1;
            y+=s.charAt(i)==')'?-1:1;
            if (y<0) 
            return false;
            x=Math.max(x,0);
        }
        return x==0;
    }
}