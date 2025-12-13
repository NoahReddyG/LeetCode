class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ans=new ArrayList<>();
        List<Integer> v=new ArrayList<>();
        Set<String> vBusiness=new HashSet<>();
        vBusiness.add("electronics");
        vBusiness.add("grocery");
        vBusiness.add("pharmacy");
        vBusiness.add("restaurant");
        for(int i=0;i<code.length;i++)
        {
            if(!isActive[i]||code[i].equals("")||!isAlphaNumeric(code[i])) 
            continue;
            if(!vBusiness.contains(businessLine[i])) 
            continue;
            v.add(i);
        }
        Collections.sort(v, (a,b) -> 
        {
            if(!businessLine[a].equals(businessLine[b]))
                return businessLine[a].compareTo(businessLine[b]);
            return code[a].compareTo(code[b]);
        });
        for(int i:v)
        {
            ans.add(code[i]);
        }
        return ans;
    }
    boolean isAlphaNumeric(String b){
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            if(!Character.isLetterOrDigit(ch)&&ch!='_') 
            return false;
        }
        return true;
    }
}