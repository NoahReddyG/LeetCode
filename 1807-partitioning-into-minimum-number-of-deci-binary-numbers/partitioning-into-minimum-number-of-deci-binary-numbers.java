class Solution {
    public int minPartitions(String n) {
        int x=0;
        for(int i=0;i<n.length();i++)
        x=Math.max(x,n.charAt(i)-'0');
        return x;
    }
}