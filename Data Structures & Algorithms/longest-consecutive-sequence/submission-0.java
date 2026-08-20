class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();

        int length = 0;
        for(int num : nums)
        {
            set.add(num);
        }
        for(int num : nums)
        {
            if(!set.contains(num - 1))
            {
                int current = 1;
                while(set.contains(num+1))
                {
                    current++;
                    num++;
                }
                if(current > length)
                {
                    length = current;
                }
            }
        }
        return length;  
    }
}
