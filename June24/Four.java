import java.util.*;
class Four
{
	public static void main(String[] args)
	{
		int count, first, second , next;
		System.out.println("\n First 15 Fibonacci Elements ");		
		first = 0;
		second = 1;
		for( count = 1; count <= 15; count++ )
		{
			System.out.print(" [ " + first + " ]");
			next = first + second;
			first = second;
			second = next;
		}
		System.out.println();
	}
}