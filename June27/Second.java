/*
*********
 *******
  *****
   ***
    *
*/
class Second
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1; col <= row - 1; col++ )
			{
				System.out.print(" ");
			}
			for( col = 1; col <= 11 - 2 * row; col++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}