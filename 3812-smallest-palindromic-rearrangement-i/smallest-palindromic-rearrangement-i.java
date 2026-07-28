class Solution {
    public String smallestPalindrome(String s) {
        int l=s.length();
        if(l<=1)
        return s;
        int freq[]=new int[26];
        for (int i=0;i<l;i++)
            freq[s.charAt(i)-'a']++;
        StringBuilder st=new StringBuilder();
        String m="";
        for (int i=0;i<26;i++) 
        {
            if (freq[i]>0) 
            {
                if (freq[i]%2!=0) 
                {
                    m=String.valueOf((char)('a'+ i));
                }
                for (int j=0;j<freq[i]/2;j++) 
                {
                    st.append((char)('a'+i));
                }
            }
        }
        String right=new StringBuilder(st).reverse().toString();
        return st.toString()+m+right;
    }
}