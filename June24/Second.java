import java.util.*;
class Second
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Total Number of Even Number : ");
		int total = sc.nextInt();
		int value;
		for( value = 2; value <= 2 * total; value+=2 )
		{
			System.out.print(" [ " + value + " ] "); 
		}
		System.out.println();
	}
}