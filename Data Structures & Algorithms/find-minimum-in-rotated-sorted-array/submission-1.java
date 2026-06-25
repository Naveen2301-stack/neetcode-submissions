class Solution {
    public int findMin(int[] nums) {

        int piviot = 0;

        int  n = nums.length;

        int low =0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<nums[0]){
                piviot = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return nums[piviot];
        
    }
}
