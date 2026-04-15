class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int l=words.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l;i++)
        {
            if(words[i].equals(target))
            {
            int f=(i-startIndex+l)%l;
            int b=(startIndex-i+l)%l;
            int d=Math.min(f,b);
            min=Math.min(min,d);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}