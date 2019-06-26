/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
class Eleven
{
	public static void main(String[] args)
	{
		int row,col,space,star;
		space = 4;
		star = 1;
		for( row = 1; row <= 9; row++ )
		{
			for( col = 1; col <= space; col++ )
			{
				System.out.print(" ");
			}
			for( col = 1; col <= star; col++ )
			{
				System.out.print("*");
			}
			System.out.println();
			if( row < 5 )
			{
				star += 2;
				space--;
			}
			else
			{
				star -= 2;
				space++;
			}
		}
	}
}