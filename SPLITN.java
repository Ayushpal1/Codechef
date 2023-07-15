/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SPLITN
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0){
	        long n = sc.nextLong();
	        String s = Long.toBinaryString(n);
	        String ones = s.replace("0","");
	        System.out.println(ones.length()==1?"0":ones.length()-1);
	    }
	}
}
