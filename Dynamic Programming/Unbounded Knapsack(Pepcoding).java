	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int[] value = new int[n];
            int[] weight = new int[n];
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                weight[i] = sc.nextInt();
            }
            
            int cap = sc.nextInt();
            
            int[] dp = new int[cap+1];
            dp[0] = 0;
            
            for(int i=0; i<n; i++){
                
                for(int j=1; j<dp.length; j++){
                    
                    if(weight[i] <= j){
                        
                        dp[j] += Math.max(dp[j], dp[j-weight[i]] + value[i]);
                        
                    }
                    
                }
                
            }
            
            System.out.println(dp[cap]);
	    }
	}
