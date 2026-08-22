class Solution 
{
    public boolean isPalindrome(String s) 
    {
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                str.append(Character.toLowerCase(c));
            }
        }

        String clean = str.toString();

        char[] valid = clean.toCharArray();

        int left = 0;

        for(int right = valid.length - 1; right > left; right--)
        {
            if(valid[left] != valid[right])
            {
                return false;
            }
            left++;
        }
        return true;
    }
}
