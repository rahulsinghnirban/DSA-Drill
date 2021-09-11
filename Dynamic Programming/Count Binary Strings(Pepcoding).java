import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int ones = 1;
    int zeros = 1;
    
    for(int i=2; i<=n; i++){
        int nones = ones + zeros; // 3
        int nzeros = ones; // 2
        
        ones = nones; // 2
        zeros = nzeros; // 1
    }
    
    System.out.println(ones + zeros);
    
 }

}
