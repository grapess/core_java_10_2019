import java.util.*;
class Seven
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("\n Enter First  Number : ");
		n1 = sc.nextInt();
		System.out.print("\n Enter Second Number : ");
		n2 = sc.nextInt();
		if( n1 == n2 )
		{
			System.out.println("\n Both Number are Equal ");
		}
		else
		{
			if( n1 > n2 )
			{
				System.out.println("\n First Number is Largest ");
			}
			else
			{	
				System.out.println("\n Second Number is Largest ");
			}
		}
	}
}