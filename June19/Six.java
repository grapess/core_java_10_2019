import java.util.*;
class Six
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num, rem, sum, temp;
		System.out.print("\n Enter Any Five Digit Number : ");
		num = sc.nextInt();
		
		temp = num;
		
		rem = temp % 10;
		sum = rem;
		temp = temp / 10;
		
		rem = temp % 10;
		sum = sum + rem;
		temp = temp / 10;
		
		rem = temp % 10;
		sum = sum + rem;
		temp = temp / 10;
		
		rem = temp % 10;
		sum = sum + rem;
		temp = temp / 10;
		
		rem = temp % 10;
		sum = sum + rem;
		temp = temp / 10;
		
		System.out.println("\n Sum of Digit of Given Number [ " + num + " ] : " + sum );
	}
}