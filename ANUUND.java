/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ANUUND
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0){
	        int s = sc.nextInt();
	        int[] a = new int[s];
	        for(int i = 0;i<s;i++)
	            a[i] = sc.nextInt();
	        Arrays.sort(a);
	        if(s>2){
	            for(int i = 2;i<s;i+=2)
	            {
	                int temp = a[i];
	                a[i] = a[i-1];
	                a[i-1] = temp;
	            }
	        }
	        for(int i = 0;i<s;i++)
	            System.out.print(a[i] + " ");
	       System.out.println();
	    }
	}
}
