import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int X=sc.nextInt();
		    if(X<=100)
		    {
		        System.out.println(X);
		        
		    }
		    else
		    {
		        System.out.println(X-10);
		    }
		}

	}
}
