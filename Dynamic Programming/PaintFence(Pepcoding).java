import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int same = k*1;
        int diff = k * (k-1);
        int total = same + diff;
        
        for(int i=3; i<=n; i++){
            same = diff;
            diff = (k-1) * total;
            
            total = same + diff;            
        }
        
        System.out.println(total);
        
      // Using DP Array:-
        
        // int[][] dp = new int[3][n-1];
        
        // for(int j=0; j<dp[0].length; j++){
        //     for(int i=0; i<dp.length; i++){
                
        //         if(i==2){
        //             dp[i][j] = dp[i-1][j] + dp[i-2][j];
        //         }
                
        //         if(j==0){
                    
        //             if(i==0 && j==0){
        //                 dp[i][j] = k;
        //             }
        //             if(i==1 && j==0){
        //                 dp[i][j] = k * (k-1);
        //             }
                    
        //         }
                
                
        //         else{
        //             if(i==0){
        //                 dp[i][j] = dp[i+1][j-1];
        //             }
        //             if(i==1){
        //                 dp[i][j] = (k-1)* (dp[i+1][j-1]);
        //             }
        //         }
                
                
        //     }
        // }
        
        // System.out.println(dp[dp.length-1][dp[0].length-1]);
        

    }
}
