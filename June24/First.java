import java.util.*;
class First
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Total Number of Even Number : ");
		int total = sc.nextInt();
		int value;
		for( value = 1; value <= total; value++ )
		{
			System.out.print(" [ " + ( value * 2 ) + " ] "); 
		}
		System.out.println();
	}
}