/*
    *
   * *
  * * *
 * * * *
* * * * *
*/
class Nine
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1; col <= 5 - row; col++ )
			{
				System.out.print(" ");
			}
			for( col = 1; col <= 2 * row - 1; col++ )
			{
				if( col % 2 == 0 )
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}