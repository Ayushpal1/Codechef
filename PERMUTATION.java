/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PERMUTATION
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0){
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for(int i = 0;i<n;i++)
	            a[i] = sc.nextInt();
	        Arrays.sort(a);
	        int sum = 0;
	        boolean flag = true;
	        for(int i = 0;i<n;i++)
	        {
	            if(a[i] > i+1)
	                flag = false;
	            else
	                sum += Math.abs((i+1)- a[i]);
	        }
	        System.out.println(flag?sum:-1);
	    }
	}
}
