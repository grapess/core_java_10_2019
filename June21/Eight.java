import java.util.*;
class Eight
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\n Enter Any Number : ");
		num = sc.nextInt();
		String result;
		result = num % 2 == 0 ? "\n Even Number" : "\n Odd Number";
		System.out.println(result);
	}
}