import java.util.*;
class Third
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		int sum,temp;
		temp = num;
		if( temp < 0 )
		{
			temp = temp * -1;
		}
		sum = temp % 10;
		temp = temp / 10;
		while( temp > 9 )
		{
			temp = temp / 10;
		}
		sum = sum + temp;
		System.out.println("\n Sum of First and last Digit of Given Number : " + sum );
	}
}