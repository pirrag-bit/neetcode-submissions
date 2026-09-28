class Solution 
{
    public long pickGifts(int[] gifts, int k) 
    {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> Integer.compare(b, a));

        for(int gift : gifts)
        {
            heap.offer(gift);
        }

        for(int i = 0; i<k; i++)
        {
            int max = heap.peek();
            max = (int) Math.sqrt(max);
            heap.poll();
            heap.offer(max);
        }

        int res = 0; 
        for(int gift : heap)
        {
            res += gift;
        }
        return res;

    }

}