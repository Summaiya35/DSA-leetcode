class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int start=0;
        int end=nums.length-1;

int count=0;
           int arr[]=new int[nums.length];  
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]<pivot)
             
                arr[start++]=nums[i];
               
               

             else if(nums[i]>pivot)
               
                 arr[end--]=nums[i];
               
            else
            count++;
              
               
             
        }


        for(int i=0;i<count;i++)
        arr[start++]=pivot;

         int left=start;
         int right=nums.length-1;
        while(left<right)
        {      int temp;
            temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;}


    
    return arr;
    }
}
