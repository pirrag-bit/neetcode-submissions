class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int max = 0;
        int left = 0;
        int right = left+1;
        int current = 0;
        while(right < prices.length)
        {
            if(prices[right] < prices[left])
            {
                left = right;
            }
            else if(prices[right] - prices[left] > current)
            {
                current = prices[right] - prices[left];
            }
            right++;

        }
        if(current > max) return current;
        else return max;
    }
}
