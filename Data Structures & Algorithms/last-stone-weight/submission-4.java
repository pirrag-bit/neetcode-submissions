class Solution 
{
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones)
        {
            maxHeap.offer(stone);
        }

        while(maxHeap.size() >= 2)
        {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if( x == y)
            {
                continue;
            }
            if(x < y)
            {
                y = y - x;
                maxHeap.offer(y);
            }
            else if( x > y)
            {
                x = x - y;
                maxHeap.offer(x);
            }
        } 
        if(maxHeap.peek() != null) return maxHeap.poll();
        else return 0;
    }
}
