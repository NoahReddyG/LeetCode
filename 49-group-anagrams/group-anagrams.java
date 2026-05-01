class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap();
        for(String s:strs)
        {
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!m.containsKey(key))
            m.put(key,new ArrayList<>());
            m.get(key).add(s);
        }
        return new ArrayList<>(m.values());
    }
}