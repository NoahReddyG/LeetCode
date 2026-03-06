class Solution {
    public boolean checkOnesSegment(String s) {
        char ch[]=s.toCharArray();
        for(int i=1;i<ch.length;i++) 
        {
            if(ch[i]=='1'&&ch[i-1]=='0') 
            return false;
        }
        return true;
    }
}