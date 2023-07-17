/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ENCMSG
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0){
	        int n = sc.nextInt();
	        ArrayList<Character> alphs = new ArrayList<Character>();
	        for(char c = 'a';c!='{';c++ ) alphs.add(c);
	        StringBuilder s = new StringBuilder(sc.next());
	        int l = n;
	        l = l%2 == 0?l:l-1;
	        for(int i = 0;i < l-1;i += 2)
	        {
	            char temp = s.charAt(i);
	            s.setCharAt(i,s.charAt(i+1));
	            s.setCharAt(i+1,temp);
	        }
	        for(int i = 0;i<n;i++)
	        {
	            char c = alphs.get(Math.abs(alphs.indexOf(s.charAt(i))-25));
	            s.setCharAt(i,c);
	        }
	        System.out.println(s);
	    }
	}
}
