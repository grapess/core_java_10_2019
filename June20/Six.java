import java.util.*;
class Six
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		if( num % 2 == 0 )
		{
			System.out.println("\n Given Number is Even ");
		}
		else
		{	
			System.out.println("\n Given Number is Odd ");
		}
	}
}