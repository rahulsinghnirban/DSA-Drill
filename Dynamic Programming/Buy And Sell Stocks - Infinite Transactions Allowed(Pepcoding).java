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
        
        int bd = 0;
        int sd = 0;
        int profit = 0;
        
        for(int i=1; i<n; i++){
            
            if(arr[i] >= arr[i-1]) sd++;
            
            else{
                profit += arr[sd] - arr[bd];
                sd = bd = i;
            }
            
        }
        
        profit += arr[sd] - arr[bd];
        
        System.out.println(profit);
        
    }

}
