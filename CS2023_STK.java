/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CS2023_STK
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0){
	        int d = sc.nextInt();
	        int om = 0;
	        int count = 0;
	        for(int i = 0;i < d;i++)
	        {
	            int n = sc.nextInt();
	            if(n>0)
	                count++;
	            else
	                count = 0;
	            if(count>om)
	                om = count;
	        }
	        int addy = 0;
	        int count1 = 0;
	        for(int i = 0;i < d;i++)
	        {
	            int n = sc.nextInt();
	            if(n>0)
	                count1++;
	            else
	                count1 = 0;
	            if(count1>addy)
	                addy = count1;
	        }
	        if(om>addy)
	            System.out.println("OM");
	        else if(addy>om)
	            System.out.println("ADDY");
	        else
	            System.out.println("DRAW");
	    }
	}
}
