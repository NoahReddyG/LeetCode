class Solution {
    public int[] separateDigits(int[] nums) {  
        List<Integer> l=new ArrayList<>();
        for (int num:nums) 
        {
            String s=String.valueOf(num);
            for (char i:s.toCharArray()) 
            {
                l.add(i-'0');
            }
        }
        int[] res=new int[l.size()];
        for (int i=0;i<l.size();i++) 
        {
            res[i]=l.get(i);
        }
        return res;
    }
}