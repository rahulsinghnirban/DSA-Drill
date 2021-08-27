class Solution {
    public void rotate(int[] nums, int k) {
        
        int n =nums.length;
        
        if(k>n){
            k=k%n;
        }
        
        if(k<0){
            k=k+n;
        }
        
        
        reverse(nums,n-k, n-1);
        reverse(nums,0, (n-1)-k);
        reverse(nums, 0, n-1);
        
    }
    
    public void reverse(int[] arr, int li, int ri){
        while(li<ri){
            
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            
            ri--;
            li++;
        }
    }
}
