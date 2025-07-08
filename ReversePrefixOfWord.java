class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder newstring= new StringBuilder ();
        int index=0;
        String mysubstring=" ";
        boolean found=false;
        Stack<Character> mystack = new Stack<>();
        

        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                index=i;
                found=true;
                break;
            }
        }          
                  mysubstring=word.substring(index+1,word.length());
        if(found)
            {
                for(int i=0;i<=index;i++)
                
                    mystack.push(word.charAt(i));
               while(!mystack.isEmpty())

                    newstring.append(mystack.pop());

                return newstring.toString()+mysubstring;    
                
            }


           else
                   return word;
        }

}
    
    
