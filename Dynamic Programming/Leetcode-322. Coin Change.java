class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        
        int max = amount+1;
        Arrays.fill(dp, max);
        
        dp[0] = 0;
        
        for(int i=0; i<coins.length; i++){
            
            for(int j = coins[i]; j<dp.length; j++){
                
                dp[j] = Math.min(dp[j], dp[j-coins[i]] + 1);
                
            }
            
        }
        
        if(dp[amount] > amount){
            return -1;
        }
        
        return dp[amount];
        
    }
}
