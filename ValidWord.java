class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
         return false;
         boolean Vowel=false;
         boolean consonant= false;
        for(int i=0;i<word.length();i++)
        {

            Character ch=word.charAt(i);
            if(!Character.isLetterOrDigit(word.charAt(i)))
            return false;

            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||
            ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            Vowel= true;
           
           else if(Character.isLetter(ch))
           consonant=true;

            
        }
                     
        
        return Vowel && consonant;
        
    }
}
