class Solution 
{
    public int maxDepth(String s) 
    {
        Stack<Character> stack = new Stack<>();

        int count = 0;

        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                stack.push(c);
            }
            else if(c == ')')
            {
                stack.pop();
            }
            count = Math.max(count, stack.size());
        }
        return count;
        
    }
}