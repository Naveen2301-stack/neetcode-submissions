class Solution {
    public int lengthOfLongestSubstring(String s) {

        int  n =  s.length();

        int  i = 0;
        int j = 0;
        int ans =  Integer.MIN_VALUE;

        Set<Character> set  = new HashSet<>();

        if(s.equals("")){
            return 0;
        }
        
        while(j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                ans = Math.max(ans,set.size());
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
        
    }
}
