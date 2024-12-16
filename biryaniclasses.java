import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner sc = new Scanner(System.in);
	    	int T = sc.nextInt();

	    	while(T-->0)
	    	{
	    		int weeks = sc.nextInt();
	    		int coins = sc.nextInt();
	    		
	    		int cost = weeks*coins;
	    		System.out.println(cost);
	    	}

	}
}
