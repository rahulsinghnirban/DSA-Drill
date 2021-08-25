import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] r = new int[n];
        int[] b = new int[n];
        int[] g = new int[n];
        
        for(int i=0; i<n; i++){
            r[i] = sc.nextInt();
            b[i] = sc.nextInt();
            g[i] = sc.nextInt();
        }
        
        int red = r[0]; // 1
        int blue = b[0]; // 5
        int green = g[0]; // 7
        
        for(int i=1; i<n; i++){
            int nred = Math.min(blue, green) + r[i];
            int nblue = Math.min(red, green) + b[i];
            int ngreen = Math.min(blue, red) + g[i];
            
            red = nred;
            blue = nblue;
            green = ngreen;
        }
        
        System.out.println( Math.min(blue,Math.min(green, red)) );
        
        
    }
}
