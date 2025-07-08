//ACCEPTED APPROACH

class Solution {
    public static int maxArea(int[] height) {
             int maxarea=0;
             int left=0;
             int right=height.length-1;

             while(left<right)
             {   
                int minimum=Math.min(height[left],height[right]);
                int distance=right-left;
                int area=minimum*distance;

                maxarea=Math.max(area,maxarea);


                if(height[left]<height[right])
                {left++;}
                else
                {right--;}
             }


             return maxarea;
    }




}



// TIME LIMIT EXCEED APPROACH

class Solution {
    public static int maxArea(int[] height) {
             int maxarea=0;
             int left=0;
             int right=height.length-1;

             while(left<right)
             {   
                int minimum=Math.min(height[left],height[right]);
                int distance=right-left;
                int area=minimum*distance;

                maxarea=Math.max(area,maxarea);


                if(height[left]<height[right])
                {left++;}
                else
                {right--;}
             }


             return maxarea;
    }




}






//WRONG APPROACH
class Solution {
    public static int maxArea(int[] height) {
             int maxarea=0;
             int left=0;
             int right=height.length-1;

             while(left<right)
             {   
                int minimum=Math.min(height[left],height[right]);
                int distance=right-left;
                int area=minimum*distance;

                maxarea=Math.max(area,maxarea);


                if(height[left]<height[right])
                {left++;}
                else
                {right--;}
             }


             return maxarea;
    }




}
