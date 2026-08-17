class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        // Create hashmap with the key being the num and the value being its frequency

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] res = new int[k];

        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int i = 0; i < bucket.length; i++) 
        {
            bucket[i] = new ArrayList<>();
        }

        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else map.put(nums[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            int number = entry.getKey();
            int frequency = entry.getValue();

            bucket[frequency].add(number);
        }

        int index = 0;

        for (int i = bucket.length - 1; i >= 0; i--) 
        {
            for (int number : bucket[i]) 
            {
                res[index] = number;
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
