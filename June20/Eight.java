import java.util.*;
class Eight
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		double result;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		result = Math.sqrt( num );
		System.out.println("\n Square Root : " + result );
		result = Math.pow( num , 3 );
		System.out.println("\n Cube of Given Number : " + result );
	}
}