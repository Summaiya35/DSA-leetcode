class Solution {
    public boolean isPalindrome(int x) {
           String Original= String.valueOf(x);
          boolean check=true;
          if(x<0 || (x%10==0 && x!=0))
          {check=false;
          return check;}
          else
          {
           int size=Original.length()-1;
           
         
           for(int i=0,j=size;i<size;i++,j--)
           { 
              if(Original.charAt(i)!=Original.charAt(j))
                 check= false;
                  
                
            
           }}

           return check;
           
           
           }

}
