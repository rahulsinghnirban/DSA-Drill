class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int n = nums.length;
        
        int arr[] = new int[2];
        
        int li = 0;
        int ri = n-1;
        
        while(li<ri){
            int sum = nums[li] + nums[ri];
            
            if(sum == tar){
                arr[0] = li+1;
                arr[1] = ri+1;
                return arr;
            }
            else if(sum > tar){
                ri--;
            }
            else{
                li++;
            }
        }
        
        return arr;
    }
}
