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
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    if(A<=B){
		        System.out.println(A);
		    }
		    else{
		        System.out.println(B);
		    }
		}

	}
}
