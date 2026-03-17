class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        int l=words.length;
        for(int i=0;i<l;++i)
        {
            for(int j=0;j<l;++j)
            {
                if(i!=j && words[j].contains(words[i]))
                {
                ans.add(words[i]);
                break;
                }
            }
        }
        return ans;
    }
}