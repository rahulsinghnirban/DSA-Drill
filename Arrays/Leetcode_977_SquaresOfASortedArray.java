class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        
        int negp = 0;
        int arr[] = new int[n];
        
        while(nums[negp] < 0){
            negp++;
        }
        
        int posp = negp; //2
        negp = negp-1; //1
        
        int counter=0;
        
        while(negp>=0 && posp<=n-1){
            
            if(nums[negp] * nums[negp] > nums[posp] * nums[posp]){
                arr[counter++] = nums[posp] * nums[posp];
                posp++;
            }
            else{
                arr[counter++] = nums[negp] * nums[negp];
                negp--;
            }
            
        }
        
        while(posp <= n-1){
            arr[counter++] = nums[posp] * nums[posp];
            posp++;
        }
        
        while(negp>=0){
            arr[counter++] = nums[negp] * nums[negp];
            negp--;
        }
        
        return arr;
        
    }
}
