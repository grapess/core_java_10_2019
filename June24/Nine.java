import java.util.*;
class Nine
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		int rem, temp , result, place;
		result = 0;
		place = 1;
		temp = num;
		if( temp < 0 )
		{
			temp = -num;
		}
		while( temp > 0 )
		{
			rem = temp % 10;
			result = ( ( rem + 1 ) % 10 ) * place + result;
			temp = temp / 10;
			place = place * 10;
		}
		System.out.println("\n Result : " + result );
	}
}