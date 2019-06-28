/*
    1
   121
  12321
 1234321
123454321
*/
class Ten
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
				System.out.print(col);				
			}
			for( col = row - 1; col >= 1; col-- )
			{
				System.out.print(col);				
			}
			System.out.println();
		}
	}
}