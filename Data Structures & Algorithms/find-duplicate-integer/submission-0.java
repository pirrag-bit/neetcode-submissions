class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int slow = 0;
        int fast = 0;

        // Move first because both pointers start at 0.
        do {
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
        } while (slow != fast);

        // Walk from the start and the meeting point at equal speed.
        int fromStart = 0;
        while (fromStart != slow) 
        {
            fromStart = nums[fromStart];
            slow = nums[slow];
        }

        return fromStart;
    }
}
