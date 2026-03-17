class Solution {
    public String thousandSeparator(int n) {
        StringBuilder str=new StringBuilder(String.valueOf(n));
        for(int i=str.length()-3;i>0;i-=3)
        str.insert(i,".");
        return str.toString();
    }
}