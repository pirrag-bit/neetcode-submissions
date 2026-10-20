class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            int count = 0;
            if(map.containsKey(num))
            {
                return true;
            }
            map.put(num, count+1);
        }
        return false;
    }
}