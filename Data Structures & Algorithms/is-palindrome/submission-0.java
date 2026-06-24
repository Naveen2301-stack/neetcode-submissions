class Solution {
    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length()-1;

        while(start<end){
            char s1 = s.charAt(start);
            char e1 = s.charAt(end);

            if(!Character.isLetterOrDigit(s1)){
                start++;
            }else if(!Character.isLetterOrDigit(e1)){
                end--;
            }else{
                if(Character.toLowerCase(s1)!=Character.toLowerCase(e1)){
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;

        
    }
}
