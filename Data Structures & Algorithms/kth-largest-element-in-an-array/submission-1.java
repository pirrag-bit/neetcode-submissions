class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int res = 0;

        for(int num : nums)
        {
            maxHeap.offer(num);
        }

        for(int i = 1; i <= k; i++)
        {   
            if(i == k)
            {
                break;
            }
            maxHeap.poll();     
        }
        return maxHeap.poll();
    }   
}
