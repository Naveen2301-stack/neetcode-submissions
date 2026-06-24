class Solution {
    public int[] twoSum(int[] nums, int target) {

        int ans[] = new int[2];
        int n = nums.length;
        Map<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<n;i++){
            int num = nums[i];
            int rem = target-num;

            if(!map.containsKey(rem)){
                map.put(num,i);
            }else{
                return new int[]{map.get(rem),i};
            }
        }
        return new int[]{};
        
    }
}
