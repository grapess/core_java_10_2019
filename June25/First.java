import java.util.*;
class First
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int total = 21;
		int pick;
		while( true )
		{
			System.out.println("\n Total Matchstick Remaining : " + total);
			System.out.println("\n Person can pick 1 or 2 or 3 or 4 Matchstick ");
			System.out.print("\n Enter Number of Matchstick you want to Pick : ");
			pick = sc.nextInt();
			if( pick >= 1 && pick <= 4 )
			{
				System.out.println("\n Computer Pick : " + ( 5 - pick ) + " Matchstick ");
				total = total - 5;
			}
			else
			{	
				System.out.println("\n Invalid Number of Matchstick Given ");
			}
			if( total == 1 )
			{
				break;
			}
		}
		System.out.println("\n There are only 1 Matchstick Remaining ");
		System.out.println(" And This is the User Turn. So Computer wins!!! ");
	}
}