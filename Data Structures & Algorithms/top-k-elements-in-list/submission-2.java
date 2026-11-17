class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num, 0) + 1);
        }

        Map<Integer, List<Integer>> buckets = new HashMap<>();

        for (int num : map.keySet()) 
        {
            int frequency = map.get(num);

            if (!buckets.containsKey(frequency)) 
            {
                buckets.put(frequency, new ArrayList<>());
            }

            buckets.get(frequency).add(num);
        }

        int[] res = new int[k];
        int index = 0;

        for (int frequency = nums.length; frequency >= 1; frequency--)      
        {
            if (!buckets.containsKey(frequency)) 
            {
                continue;
            }

            for (int num : buckets.get(frequency)) {
                res[index] = num;
                index++;

                if (index == k) 
                {
                    return res;
                }
            }
        }
        return res;
    }
}

/*
1 | 1
2 | 2
3 | 3
*/