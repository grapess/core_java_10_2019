import java.util.*;
class Four
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count,times;
		System.out.print("\n Enter Number of Times : ");
		times = sc.nextInt();
		count = 1;
		do
		{
			System.out.println(" Grapess Solutions ");
			count++;
		}
		while(  count <= times );
	}
}