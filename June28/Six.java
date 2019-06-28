class Six
{
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		cal.sum();
		cal.sum_one( 43 , 54 );
		cal.sum_one( 98 , 43 );
		cal.sum_two( 432 , 23 );
		int result = cal.sum_two( 432 , 2356 );
		System.out.println("\n Sum : " + result);
		System.out.println("\n Sum : " + cal.sum_two(23,65));
	}
}
class Calculator
{
	void sum()
	{
		int n1,n2,ans;
		n1 = 43;
		n2 = 432;
		ans = n1 + n2;
		System.out.println("\n Sum of Given Number : " + ans);
	}
	void sum_one(int n1,int n2)
	{
		int ans;
		ans = n1 + n2;
		System.out.println("\n Sum of Given Number : " + ans);
	}
	int sum_two( int n1 , int n2 )
	{
		return n1 + n2;
	}
}