class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();

        char[] ch = s.toCharArray();

        for(int i=0; i<s.length(); i++)
        {
            if(ch[i] == '(' || ch[i] == '{' || ch[i] == '[')
            {
                stack.push(ch[i]);
            }
            //if(ch[i] == ')' || ch[i] ==  || ch[i] == ']')
            //{}
            switch(ch[i])
            {
                case ')':
                    if(stack.isEmpty() || stack.peek() != '(')
                    {
                        return false;
                    }
                    stack.pop();
                    break;
                case '}':
                    if(stack.isEmpty() || stack.peek() != '{')
                    {
                        return false;
                    }
                    stack.pop();
                    break;
                case ']':
                   if(stack.isEmpty() || stack.peek() != '[')
                    {
                        return false;
                    }
                    stack.pop();
                    break; 
            }
        }
        if(stack.isEmpty()) return true;

        else return false;
    }
}
