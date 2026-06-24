class Solution {
    public int characterReplacement(String s, int k) {

        int  n = s.length();
        int  left = 0;
        int maxFreq = 0;
        int res = 0;

        Map<Character,Integer> map  = new HashMap<>();

        for(int right = 0; right<n; right++){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq =  Math.max(maxFreq,map.get(c));

            while((right-left+1)-maxFreq>k){
                 char lefChar = s.charAt(left);
                map.put(lefChar,map.get(lefChar)-1);
                left++;
            }
            res = Math.max(res,right-left+1);
        }
        return res;
        
    }
}
