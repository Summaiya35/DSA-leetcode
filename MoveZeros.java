class Solution {
    public void moveZeroes(int[] nums) {
        

        int insert=0;
        //bring all elements in front of array
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[insert]=nums[i];
                insert++;
            }
        }

         // fill end with 0's
        for(int i=insert;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}
