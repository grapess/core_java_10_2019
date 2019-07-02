/*
1
32
4543
567654
67898765
*/
class First
{
	public static void main(String[] args)
	{
		int row,col,value;
		for( row = 1; row <= 5; row++ )
		{
			if( row >= 3 )
			{
				value = row + 1;
				for( col = 1; col <= row - 2; col++ )
				{
					System.out.print( value );
					value++;
				}
			}
			value = 2 * row - 1;
			for( col = 1; col <= row; col++ )
			{
				System.out.print( value );
				value--;
			}
			System.out.println();
		}
	}
}