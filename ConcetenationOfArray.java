class Solution {
    public int[] getConcatenation(int[] nums) {
             int n=nums.length;
             int myarr[]=new int[n+n];
            
            int i,j;
             for(i=0,j=0;j<n+n;i++,j++)
             {
                myarr[j]=nums[i];
                if(i==n-1)
                   i=-1;

                
             }


             return myarr;
    }
}
