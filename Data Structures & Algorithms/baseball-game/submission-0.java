class Solution 
{
    public int calPoints(String[] operations) 
    {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations)
        {
            if(s.equals("+"))
            {
                stack.push(stack.get(stack.size()-1) + stack.get(stack.size()-2));
            }
            else if(s.equals("D"))
            {
                stack.push( 2 * stack.peek());
            }
            else if(s.equals("C"))
            {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(int num : stack)
        {
            sum += num;
        }
        return sum;
    }
}