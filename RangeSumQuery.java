class NumArray {

           private int[] P;
           public int previous(int [] A, int k)
    {
        int sum=0;
        while(k>=0)
        {
            sum+=A[k];
            k--;
        }
   return sum;
    }

    public NumArray(int[] nums) {
           
             P= new int [nums.length];
             P[0]=nums[0];
             for(int i=1;i<nums.length;i++)
             {
                P[i]=nums[i]+previous(nums,i-1);
             }

    }
       
    

    
    public int sumRange(int left, int right) {
                   if(left==0)
                   return P[right];
                       return P[right]-P[left-1];    
    }
}

