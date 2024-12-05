Paper Cutting.java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++)
		{
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=((a/b)*(a/b));
		    System.out.println(c);
		}

	}
}
