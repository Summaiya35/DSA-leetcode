import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     
       int size1= nums1.length;
       int size2=nums2.length;
       int arr[]=new int [size1+size2];
       for(int i=0;i<size1;i++)
       {
        arr[i]=nums1[i];
       }

for(int i=0,j=size1;i<size2;i++,j++)
{   arr[j]=nums2[i];
     
}

Arrays.sort(arr);

int newsize=size1+size2;
if(newsize%2!=0)
return arr[(newsize-1)/2];
else
{
    return (arr[(newsize-1)/2]+arr[((newsize-1)/2)+1])/2.0;


}
       
    }
}
