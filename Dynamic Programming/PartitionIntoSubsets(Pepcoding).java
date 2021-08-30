import java.io.*;
import java.util.*;

public class Main {
        
    public static long partitionKSubset(int n, int k) {
        // write your code here
        long[][] dp = new long[k+1][n+1];
        
        for(int i=0; i<dp.length; i++){
            
            for(int j=0; j<dp[0].length; j++){
                
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if(i==j){
                    dp[i][j] = 1;
                }
                else if(i>j){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = dp[i][j-1] * i + dp[i-1][j-1];
                }
                
            }
            
        }
        
        return dp[dp.length-1][dp[0].length-1];
        
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}
