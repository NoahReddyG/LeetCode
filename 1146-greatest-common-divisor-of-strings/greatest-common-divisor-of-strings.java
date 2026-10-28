class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
        return "";
        int l=gcd(str1.length(),str2.length());
        return str1.substring(0,l);
    }
    int gcd(int l1, int l2)
    {
        int min=Math.min(l1,l2);
        for(int i=min;i>0;i--)
        {
            if(l1%i==0 && l2%i==0)
            return i;
        }
        return 1;
    }
}