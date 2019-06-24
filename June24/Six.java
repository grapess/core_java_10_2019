import java.util.*;
class Six
{
	public static void main(String[] args)
	{
		int count,value;
		System.out.println("\n First 15 Series Elements ");		
		for( count = 1; count <= 15; count++ )
		{
			value = count * count - 1;
			System.out.print(" [ " + value + " ]");		
		}
		System.out.println();
	}
}