class Solution {
    public int minimumPushes(String word) {
        int x=word.length()>>3;
        int y=word.length()&7;
        return ((x<<2)+y)*(x+1);
    }
}