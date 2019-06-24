import java.util.*;
class Seven
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int price, d1, d2;
		System.out.print("\n Enter Total Amount : ");
		price = sc.nextInt();
		if( price > 1000 )
		{
			d1 = 20;
		}
		else
		{
			d1 = 10;
		}
		d2 = price > 1000 ? 20 : 10;
		System.out.println("\n d1 = " + d1 + " d2 = " + d2 );
	}
}