import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int least = arr[0];
        int mpist = 0;
        int[] dpl = new int[n];
        
        for(int i=1; i<n; i++){
            
            if(arr[i]<least){
                least = arr[i];
            }
            
            mpist = arr[i] - least; 
            
            if(mpist > dpl[i-1]){
                dpl[i] = mpist;
            }
            else{
                dpl[i] = dpl[i-1];
            }
        }
        
        int mpibt = 0;
        int max = arr[arr.length-1];
        int[] dpr = new int[n];
        
        for(int i=n-2; i>=0; i--){
            
            if(arr[i] > max){
                max = arr[i];
            }
            
            mpibt = max - arr[i];
            
            if(mpibt > dpr[i+1]){
                dpr[i] = mpibt;
            }
            else{
                dpr[i] = dpr[i+1];
            }
            
        }
        
        int ans = 0;
        
        for(int i=0; i<n; i++){
            if(dpl[i] + dpr[i] > ans){
                ans = dpl[i] + dpr[i];
            }
        }
        
        System.out.println(ans);
    }

}
