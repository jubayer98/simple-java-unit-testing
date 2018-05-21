 package junitTesting;

public class testing {
	
	//addition method, that adds two integer numbers
	public int addition(int x, int y)
	{
		return x+y;
	}
	
	//subtraction method, that subtracts two double numbers
	public double subtraction(double x, double y)
	{
		return x-y;
	}
	
	//multiplication method, that multiply two double numbers
	public double multiplication(double x, double y)
	{
		return x*y;
	}
	
	//square method, that gives the square value of any integer number
	public int square(int x)
	{
		return x*x;
	}
	
	//letter count method, that counts 'X' character from a string 
	public int countX(String word)
	{
		int count = 0;
		
		for(int i=0; i<word.length(); i++)
		{
			if(word.charAt(i)=='x' || word.charAt(i)=='X')
			{
				count++;
			}
		}
		
		return count;
	}
	
}
