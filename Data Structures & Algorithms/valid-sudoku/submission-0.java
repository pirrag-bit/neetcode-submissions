class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        for(int i=0; i<9; i++)
        {
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j<9; j++)
            {
                if(board[i][j] != '.')
                {
                    if(set.contains(board[i][j]))
                    {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }

        for(int i=0; i<9; i++)
        {
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j<9; j++)
            {
                if(board[j][i] != '.')
                {
                    if(set.contains(board[j][i]))
                    {
                        return false;
                    }
                    set.add(board[j][i]);
                }
            }
        }

        for(int i =0; i<9; i++)
        {
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j<3; j++)
            {
                for(int k = 0; k<3; k++)
                {
                    int row = (i / 3) * 3 + j;
                    int col = (i % 3) * 3 + k;
                    if(board[row][col] == '.') continue;
                    if(set.contains(board[row][col])) return false;
                    set.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
