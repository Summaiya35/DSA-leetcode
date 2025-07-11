class Solution {
    public int countNegatives(int[][] grid) {

        int NegativeNumbers=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
              if(grid[i][j]<0)
              NegativeNumbers+=1;
            }
        }


        return NegativeNumbers;
    }
}
