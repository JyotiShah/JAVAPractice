package myjavaProgram;

import java.io.*;

class Prob1 {

	public static void main(String args[])
	{
		int m[] = new int[10];
		int max = 0, min = 0, n;
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter how many members in family");
			n = Integer.parseInt(br.readLine());
			System.out.println("Enter the ages of each family member: ");
			for(int k=1; k<n ; k++)
			{
				m[k] =Integer.parseInt(br.readLine());
			}
			for(int k = 0; k <n; k++)
			{
				if(m[k] > max)
					max = m[k];
				
				if(m[k] < min)
					min = m[k];
			}
		
			System.out.println("Maximum age is :" +max);
			System.out.println("Minimum age is :" +min);
		}
		catch(Exception e)
		{
			System.out.println("Out of Array");
		}
	}
	
	
}
