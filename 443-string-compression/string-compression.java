class Solution {
    public int compress(char[] chars) {
        int r=0;
        int w=0;
        while(r<chars.length)
        {
            char ch=chars[r];
            int l=0;
            while(r<chars.length && chars[r]==ch)
            {
            r++;
            l++;
            }
            chars[w++]=ch;
            if(l>1)
            {
                for(char i:Integer.toString(l).toCharArray())
                chars[w++]=i;
            }
        }
        return w;
    }
}