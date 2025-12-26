class Solution {
    public int bestClosingTime(String customers) {
        int best=0;
        int min=0;
        int pre=0;
        
        for (int i=0;i<customers.length();i++) 
        {
            char ch=customers.charAt(i);
            pre+=ch=='Y'?-1:1;
            
            if (pre<min) 
            {
                best=i+1;
                min=pre;
            }
        }
        return best;
    }
}