class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder();
            
        int n = s.length();
        int li=0;
        int ri=0;
        
        for(int i=0; i<n; i++){
            sb.append(s.charAt(i));
            if(Character.isWhitespace(s.charAt(i)) || i==n-1){
                if(i==n-1){
                    i++;
                }
                ri = i-1;
                while(ri>li){
                    
                    char ch = s.charAt(li);
                    sb.setCharAt(li, s.charAt(ri));
                    sb.setCharAt(ri, ch);
                    
                    ri--;
                    li++;
                }
                li=i+1;
            }
        }
        
        return sb.toString();
        
    }
}
