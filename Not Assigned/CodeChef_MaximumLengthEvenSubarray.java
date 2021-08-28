//question -> https://www.codechef.com/LTIME99C/problems/MXEVNSUB

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		
		while(t!=0){
		    
		  int n = sc.nextInt();
		  int sum = 3;
		  int ans = 0;
		  
		  if(n==2){
		      System.out.println(1);
		      //break;
		  }
		  
		  else{
		  
		  for(int i=3; i<=n; i++){
		      int nsum = sum + i; //6
		      
		      if(nsum % 2 == 0){
		          ans = i;
		      }
		      else{
		          ans = i-1;
		      }
		      
		      sum = nsum;
		  }
		    
		   
		    System.out.println(ans);
		    
		  }

		    
		    t--;
		}
	}
}
