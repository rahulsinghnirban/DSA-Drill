class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int arr[] = new int[n];
        arr[0] = nums[0];
        int pro = 1;
        
      //making arr as commulative sum of left to right traversal of nums[]
      //pro will work as real time right to left commulative sum off nums[]
        for(int i=1; i<n; i++){
            arr[i] = nums[i] * arr[i-1];
        }
        
        for(int i=n-1; i>=0; i--){
            
            if(i==0){
                arr[i] = pro;
            }
            else{
                arr[i] = arr[i-1] * pro;
                pro = pro * nums[i];
            }
        }
        
        return arr;
        
    }
}
