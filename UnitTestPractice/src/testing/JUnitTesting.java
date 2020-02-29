package testing;

public class JUnitTesting {
	public int square(int x)
	{
		return x*x;
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int count(String s, char c)
	{
		int cnt=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == c) cnt++;
		}
		return cnt;
	}
}
