
// RESULTS RUNTIME ERROR 
class Solution {
    public int reverse(int x) {
            String myString = String.valueOf(x);
            long num=0;
            String shifted;
            int size= myString.length();
            if(size==1)
            return x;
            else
            {
                StringBuilder NewMyString=  new StringBuilder(myString);
                for(int i=0,j=size-1;i<size;i++,j--)
                NewMyString.setCharAt(i,myString.charAt(j));

                if(NewMyString.charAt(size-1)=='-')
                
               { 
                 
                shifted= NewMyString.charAt(size-1)+NewMyString.substring(0,size-1);
                
                       
               num=Long.parseLong(shifted);
               if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE)
               {
                return 0;
               }

               return (int)num;

              }

               num= Long.parseLong(NewMyString.toString());
               if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE)
               {
                return 0;
               }

               return (int)num;
                
            }
    }
}


//ACCEPTED SOLUTION


class Solution {
    public int reverse(int x) {
            String myString = String.valueOf(x);
            long num=0;
            String shifted;
            int size= myString.length();
            if(size==1)
            return x;
            else
            {
                StringBuilder NewMyString=  new StringBuilder(myString);
                for(int i=0,j=size-1;i<size;i++,j--)
                NewMyString.setCharAt(i,myString.charAt(j));

                if(NewMyString.charAt(size-1)=='-')
                
               { 
                 
                shifted= NewMyString.charAt(size-1)+NewMyString.substring(0,size-1);
                
                       
               num=Long.parseLong(shifted);
               if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE)
               {
                return 0;
               }

               return (int)num;

              }

               num= Long.parseLong(NewMyString.toString());
               if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE)
               {
                return 0;
               }

               return (int)num;
                
            }
    }
}
