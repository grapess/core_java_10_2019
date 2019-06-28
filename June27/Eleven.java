/*
    1
   1 1
  1 3 1
 1 3 3 1
1 3 5 3 1
*/
class Eleven
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
			for( col = 1; col <= row; col++ )
			{
				if( col % 2 == 0 )
				{
					System.out.print(" ");
				}					
				else
				{
					System.out.print(col);
				}
			}
			for( col = row - 1; col >= 1; col-- )
			{
				if( col % 2 == 0 )
				{
					System.out.print(" ");
				}					
				else
				{
					System.out.print(col);
				}
			}
			System.out.println();
		}
	}
}