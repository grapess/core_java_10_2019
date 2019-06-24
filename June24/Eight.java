import java.util.*;
class Eight
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int num = sc.nextInt();
		int sum,rem,temp;
		temp = num;
		if( temp < 0 )
		{
			temp = -num;
		}
		String result = "";
		boolean last_digit = true;
		sum = 0;
		while( temp > 0 )
		{
			rem = temp % 10;
			sum = sum + rem;
			if( last_digit )
			{
				result = rem + result;
				last_digit = false;
			}
			else
			{
				result = rem + " + " + result;
			}			
			temp = temp / 10;
		}
		result = "\n [ " + result + " = " + sum + " ]";
		System.out.println(result);
	}
}