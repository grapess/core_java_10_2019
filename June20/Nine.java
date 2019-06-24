import java.util.*;
class Nine
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double num;
		double result;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextDouble();
		result = Math.ceil( num );
		System.out.println("\n Ceil Result : " + result );
		result = Math.floor( num );
		System.out.println("\n Floor Result : " + result );
		result = Math.log10( num );
		System.out.println("\n Log 10 Result : " + result );
	}
}