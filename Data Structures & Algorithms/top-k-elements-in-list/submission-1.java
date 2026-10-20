class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
            // explain?
        }

        List<List<Integer>> buckets = new ArrayList<>();

        //explain
        for (int i = 0; i <= nums.length; i++) 
        {
            buckets.add(new ArrayList<>());
        }

        // ** EXPLAIN **
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int num = entry.getKey();
            int frequency = entry.getValue();
            buckets.get(frequency).add(num);
        }

        int[] res = new int[k];
        int index = 0;
        for(int i = nums.length; i>= 1; i--)
        {
            for(int num : buckets.get(i))
            {
                res[index] = num;
                index++;
            }
            if(index == k)
            {
                return res;
            }
        }
        return res;

    }
}
