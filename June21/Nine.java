import java.util.*;
class Nine
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1 , n2;
		System.out.print("\n Enter First  Number : ");
		n1 = sc.nextInt();
		System.out.print("\n Enter Second Number : ");
		n2 = sc.nextInt();
		String result;
		result = n1 == n2 ? "\n Both Number are Equal " : n1 > n2 ?
			"\n First Number is Largest" : "\n Second Number is Largest";
		System.out.println(result);
	}
}