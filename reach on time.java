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
		while(T-->0&&T<=60)
		{
		    int X=sc.nextInt();
		    if(X>=30&&X<=60)
		    {
		        System.out.println("YES");
		        
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}

	}
}
