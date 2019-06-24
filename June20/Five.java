import java.util.*;
class Five
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double price;
		System.out.print("\n Enter Total Bill Amount : ");
		price = sc.nextDouble();
		if( price > 5000 )
		{
			System.out.println("\n You Go 20% Discount ");
		}
		else
		{	
			System.out.println("\n You Go 10% Discount ");
		}
	}
}