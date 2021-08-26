class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int pos=0;
        
        while(l<=h){
            int m = (l+h)/2;
            
            if(target < nums[m]){
                pos = m;
                h = m-1;
                
            }
            else if(target > nums[m]){
                pos = m+1;
                l = m+1;
            }
            else{
                return m;
            }
        }
        
        return pos;
    }
}
