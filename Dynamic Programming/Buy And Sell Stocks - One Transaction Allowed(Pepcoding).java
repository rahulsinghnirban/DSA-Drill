import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int least = Integer.MAX_VALUE;
        int protoday = 0;
        int overallpro = 0;
        
        for(int i=0; i<n; i++){
            
            if(arr[i] < least) least = arr[i];
            
            protoday = arr[i] - least;
            
            if(protoday > overallpro) overallpro = protoday;
            
        }
        
        System.out.println(overallpro);
    }

}
