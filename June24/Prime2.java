import java.util.*;
class Prime2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		boolean isprime = true;
		
		int div, range;
		int count = 0;
		div = 2;
		range = num - 1;
		while( div <= range )
		{
			count++;
			if( num % div == 0 )
			{
				isprime = false;
			}
			div++;
		}
		
		if( isprime )
		{
			System.out.println("\n Given Number is Prime ");
		}
		else
		{
			System.out.println("\n Given Number is Composite ");
		}
		System.out.println("\n Total Count : " + count );
	}
}