class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        int sol=0;
        for(char ch:s.toCharArray()) 
        {
            if(ch=='b') 
            {
                st.push('b');
            }
            else 
            {
                if(!st.isEmpty()) 
                {
                    sol++;
                    st.pop();
                }
            }
        }
        return sol;
    }
}