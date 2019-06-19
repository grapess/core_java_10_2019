import java.util.*;
class Four
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,ans;
		System.out.print("\n Enter First  Number : ");
		n1 = sc.nextInt();
		System.out.print("\n Enter Second Number : ");
		n2 = sc.nextInt();
		ans = n1 + n2;
		System.out.println("\n The Sum : " + ans );
		System.out.println("\n [ " + n1 + " + " + n2 + " = " + ans + " ] ");
	}
}