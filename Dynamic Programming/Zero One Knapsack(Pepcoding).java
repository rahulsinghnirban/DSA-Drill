import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        
        int[] value = new int[n];
        int[] weight = new int[n];
        
        for(int i=0; i<n; i++){
            value[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            weight[i] = sc.nextInt();
        }
        
        int cap = sc.nextInt();
        
        int[][] dp = new int[n+1][cap+1];
        
        for(int i=1; i<dp.length; i++){
            
            for(int j=1; j<dp[0].length; j++){
                
                if(weight[i-1] <= j)
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]]+value[i-1]);
                
                else
                dp[i][j] = dp[i-1][j];
            }
            
        }
        
        System.out.println(dp[n][cap]);

    }
}
