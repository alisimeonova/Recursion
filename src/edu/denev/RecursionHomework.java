package edu.denev;

public class RecursionHomework {

	public static void main(String[] args) 
	{
		int n = 569;
		int[] arr = {2, 12, 13, 34, 67, 101};
		//System.out.println(sum(n));
		//System.out.println(sumOfDigits(n));
		//leftToRight(n);
		//rightToLeft(n);
		//pow10(5, 1);
		//System.out.println(searchInArray(arr, 6, 1));
		System.out.println(nod(25, 15));
	}
	
	public static int sum(int n)
	{
		if(n < 1)
		{
			return n;
		}
		return n + sum(n-1);
	}
	
	public static int sumOfDigits(int n)
	{
		if(n < 10)
		{
			return n;
		}
		return n/10 + sumOfDigits(n%10);
	}
	
	public static void leftToRight(int n)
	{
		if(n == 0)
		{
			return;
		}
		leftToRight(n/10);
		System.out.println(n%10);
	}
	
	public static void rightToLeft(int n)
	{
		if(n == 0)
		{
			return;
		}
		System.out.println(n%10);
		rightToLeft(n/10);
	}
	
	public static void pow10(int n, int k)
	{
		if(k == n)
		{
			System.out.println(Math.pow(10, k));
			return;
		}
		System.out.println(Math.pow(10, k));
		pow10(n, k+1);
		System.out.println(Math.pow(10, k));
	}
	
	public static boolean searchInArray(int[] arr, int n, int k)
	{
		if(n == 1)
		{
			return false;
		}
		if(arr[n-1] == k)
		{
			return true;
		}
		if(arr[n/2] == k)
		{
			return true;
		}
		else if(arr[n/2] > k)
		{
			return searchInArray(arr, n/2-1, k);
		}
		else
		{
			return searchInArray(arr, n/2+1, k);
		}
	}
	
	public static int nod(int a, int b)
	{
		if(b == 0)
		{
			return a;
		}
		return nod(b, a%b);
	}

}
