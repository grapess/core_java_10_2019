import java.util.*;
class Ten
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num,result;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		result = (int)Math.ceil( Math.log10(num) );
		System.out.println("\n Total Digit : " + result );
	}
}