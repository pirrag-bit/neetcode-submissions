class Solution {

    public String encode(List<String> strs) 
    {
        StringBuilder encoded = new StringBuilder();
        
        for(String str : strs)
        {
            encoded.append(str.length());
            encoded.append('#');
            encoded.append(str);
        }
        
        return encoded.toString();
    }

    public List<String> decode(String str) 
    {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) 
        {
            // Find the '#' that separates the length from the string
            int j = i;

            while (str.charAt(j) != '#') 
            {
                j++;
            }

            // Convert the characters before '#' into an integer
            int length = Integer.parseInt(str.substring(i, j));

            // Move past '#'
            i = j + 1;

            // Extract the actual string
            String word = str.substring(i, i + length);

            result.add(word);

            // Move to the start of the next encoded string
            i = i + length;
        }

        return result;
    }
}
