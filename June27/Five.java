/*
*       *
 *     *
  *   *
   * * 
    *
   * *
  *   *
 *     *
*       *
*/
class Five
{
	public static void main(String[] args)
	{
		int row,col;
		for( row = 1; row <= 9; row++ )
		{
			for( col = 1; col <= 9; col++ )
			{
				if( col == row || ( row + col ) == 10 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}