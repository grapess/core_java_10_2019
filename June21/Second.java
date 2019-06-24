import java.util.*;
class Second
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1 , n2 , n3;
		System.out.print("\n Enter First  Number : ");
		n1 = sc.nextInt();
		System.out.print("\n Enter Second Number : ");
		n2 = sc.nextInt();
		System.out.print("\n Enter Third  Number : ");
		n3 = sc.nextInt();
		
		if( n1 == n2 )
		{
			if( n1 == n3 )
			{
				System.out.println("\n All Three Number are Equal ");
			}
			else
			{
				if( n1 > n3 )
				{
					System.out.println("\n First and Second Number are Largest ");
				}
				else
				{
					System.out.println("\n Third Number is Largest ");
				}
			}
		}
		else
		{
			if( n1 == n3 )
			{
				if( n1 > n2 )
				{
					System.out.println("\n First and Third Number are Largest ");
				}
				else
				{
					System.out.println("\n Second Number is Largest");
				}
			}
			else
			{
				if( n2 == n3 )
				{
					if( n2 > n1 )
					{
						System.out.println("\n Second and Third Number are Largest ");
					}
					else
					{
						System.out.println("\n First Number is Largest ");
					}
				}
				else
				{
					if( n1 > n2 )
					{
						if( n1 > n3 )
						{
							System.out.println("\n First Number is Largest ");
						}
						else
						{
							System.out.println("\n Third Number is Largest ");
						}
					}
					else
					{
						if( n2 > n3 )
						{
							System.out.println("\n Second Number is Largest ");
						}
						else
						{
							System.out.println("\n Third Number is Largest ");
						}
					}
				}
			}
		}
	}
}