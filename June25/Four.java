import java.util.*;
class Four
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int n1 = sc.nextInt();
		System.out.print("\n Enter Any Number : ");
		int n2 = sc.nextInt();
		int result,choice;
		boolean start = true;
		while( start )
		{
			System.out.println("\n Press 1 For Add These Number ");
			System.out.println(" Press 2 For Multiply These Number ");
			System.out.println(" Press 3 For Divide These Number ");
			System.out.println(" Press 4 For Subtract These Number ");
			System.out.println(" Press 5 For Exit ");
			System.out.print("\n Enter Your Choice : ");
			choice = sc.nextInt();
			switch( choice )
			{
				case 1:
					result = n1 + n2;
					System.out.println("\n Sum of Given Number : " + result);
					break;
				case 2:
					result = n1 * n2;
					System.out.println("\n Product of Given Number : " + result);
					break;
				case 3:
					if( n2 != 0 )
					{
						result = n1 / n2;
						System.out.println("\n After Divide, Result : " + result);
					}
					else
					{
						System.out.println("\n After Divide, Result : Infinite ");
					}
					break;
				case 4:
					result = n1 - n2;
					System.out.println("\n Difference of Given Number : " + result);
					break;
				case 5:
					start = false;
					System.out.println("\n Bye Bye Bye ");
					break;
				default:
					System.out.println("\n Invalid Choice Try Again ");
					break;
			}
		}
	}
}