class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        int l=0;
        while(k<s.length() && l<t.length())
        {
            if(s.charAt(k)==t.charAt(l))
            k++;
            l++;
        }
        return k==s.length();
    }
}