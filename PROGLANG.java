import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import java.util.stream.Collectors;

/* Name of the class has to be "Main" only if the class is public. */
class PROGLANG
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0)
	    {
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        Set<Integer> s = Stream.of(a,b).collect(Collectors.toSet());
	        int c = sc.nextInt();
	        int d = sc.nextInt();
	        Set<Integer> s1 = Stream.of(c,d).collect(Collectors.toSet());
	        int e = sc.nextInt();
	        int f = sc.nextInt();
	        Set<Integer> s2 = Stream.of(e,f).collect(Collectors.toSet());
	        if(s.equals(s1))
	            System.out.println(1);
	        else if(s.equals(s2))
	            System.out.println(2);
	        else
	            System.out.println(0);
	    }
	}
}
