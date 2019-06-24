import java.util.*;
class Five
{
	public static void main(String[] args)
	{
		int count, value, diff;
		System.out.println("\n First 15 Series Elements ");		
		value = 0;
		diff = 3;
		for( count = 1; count <= 15; count++ )
		{
			System.out.print(" [ " + value + " ]");
			value = value + diff;
			diff = diff + 2;
		}
		System.out.println();
	}
}