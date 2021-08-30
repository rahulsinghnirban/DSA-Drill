class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int li = 0;
        int ri = k-1;
        int min = Integer.MAX_VALUE;
        
        while(ri!=n){
            
            min = Math.min(min, nums[ri] - nums[li]);
            
            li++;
            ri++;
        }
        
        return min;
    }
}
