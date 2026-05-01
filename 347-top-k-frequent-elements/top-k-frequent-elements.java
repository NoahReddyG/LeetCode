class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int arr[]=new int[k];
        for(int i=0;i<nums.length;i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        List<Integer>[] c=new List[nums.length+1];
        for(int key:m.keySet())
        {
            int freq=m.get(key);
            if(c[freq]==null) c[freq]=new ArrayList<>();
            c[freq].add(key);
        }
        int count=0;
        for(int i=c.length-1;i>=0&&count<k;i--)
        {
            if(c[i]==null)
            continue;
            for(int val:c[i])
            {
                if(count==k)
                break;
                arr[count++]=val;
            }
        }
        return arr;
    }
}