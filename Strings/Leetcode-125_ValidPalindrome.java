class Solution {
    public boolean isPalindrome(String s) {
        int j=s.length()-1;
        
        
        for(int i=0; i<s.length();){
            
            if(i > j){
                break;
            }
            
            char ch = s.charAt(i); // a
            char ch1 = s.charAt(j);// a
            
            
            
            boolean isLetter = Character.isLetter(ch); // true
            boolean isDigit = Character.isDigit(ch); // false
            boolean isLetter1 = Character.isLetter(ch1); // true
            boolean isDigit1 = Character.isDigit(ch1); // false
            
            // if(s.length() == 2){
            //     if(!isLetter1 && !isDigit1){
            //         return true;
            //     }
            // }
            
            if(!isLetter && !isDigit){
                i++;
            }
            if(!isLetter1 && !isDigit1){
                j--;
            }
            
            if((isLetter || isDigit ) && (isLetter1 || isDigit1 )){
                
                ch = Character.toLowerCase(ch);
                ch1 = Character.toLowerCase(ch1);
                
                if(ch!=ch1){
                    return false;
                }
            
                i++;
                j--;
                
            }
                    
        }
        return true;
    }
}
