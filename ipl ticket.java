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
		while(T-->0&&T<=1000)
		{
		    int N=sc.nextInt();
		    int M=sc.nextInt();
		    if(N>M)
		    {
		        System.out.println(N-M);
		        
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}

	}
}
