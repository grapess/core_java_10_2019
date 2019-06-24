import java.util.*;
class Eight
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,sum,choice;
		sum = 0;
		while( true )
		{
			System.out.print("\n Enter Any Number : ");
			num = sc.nextInt();
			sum += num;
			System.out.println("\n Press 1 For Add Another Number ");
			System.out.print(" Enter Your Choice : ");
			choice = sc.nextInt();
			if( choice != 1 )
			{
				break;
			}
		}
		System.out.println("\n Sum of Given Number : " + sum );
	}
}