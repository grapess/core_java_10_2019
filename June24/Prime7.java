import java.util.*;
class Prime7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		boolean isprime = true;
		
		int div;
		int count = 0;
		if( num % 2 == 0 || num % 3 == 0 )
		{
			isprime = false;
			count = 1;
		}
		else
		{
			count = 1;
			div = 5;
			while( div * div <= num )
			{
				count++;
				if( num % div == 0 || num % ( div + 2 ) == 0 )
				{
					isprime = false;
					break;
				}
				div += 6;
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