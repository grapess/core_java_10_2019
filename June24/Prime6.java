import java.util.*;
class Prime6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		boolean isprime = true;
		
		int div, range;
		int count = 0;
		if( num % 2 == 0 )
		{
			isprime = false;
			count = 1;
		}
		else
		{
			count = 1;
			div = 3;
			range = (int)Math.sqrt( num );
			while( div <= range )
			{
				count++;
				if( num % div == 0 )
				{
					isprime = false;
					break;
				}
				div += 2;
			}
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