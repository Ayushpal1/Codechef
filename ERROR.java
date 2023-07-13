/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ERROR
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    byte t = sc.nextByte();
	    sc.nextLine();
	    while(t-- > 0){
	        boolean flag = false;
	        String s = sc.nextLine();
	        if(s.contains("101") || s.contains("010"))
	            flag = true;
	        System.out.println(flag?"Good":"Bad");
	    }
	}
}
