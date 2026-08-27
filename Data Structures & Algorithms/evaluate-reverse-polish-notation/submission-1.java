class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<>();

        int res = 0;

        for(int i = 0; i<tokens.length; i++)
        {
            int a = 0;
            int b = 0;
            switch(tokens[i])
            {
                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    res = a + b;
                    stack.push(res);
                    break;
                
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    res = b - a;
                    stack.push(res);
                    break;
                
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    res = a * b;
                    stack.push(res);
                    break;
                
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    res = b / a;
                    stack.push(res);
                    break;
                
                default:
                    // if it's not an operator, it must be a number
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        return stack.pop();
    }
}
