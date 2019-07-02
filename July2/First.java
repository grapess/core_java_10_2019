class First
{
	public static void main(String[] args)
	{
		Pattern pat = new Pattern();
		pat.np_7();
	}
}
class Pattern
{
	/*
	12345
	4321
	123
	21
	1
	*/
	void np_1()
	{
		int row,col,value;
		for( row = 1; row <= 5; row++ )
		{
			value = 1;
			if( row % 2 == 0 )
			{
				value = 6 - row;
			}
			for( col = 1; col <= 6 - row; col++ )
			{
				System.out.print( value );
				if( row % 2 == 0 )
				{
					value--;
				}
				else
				{
					value++;
				}
			}
			System.out.println();
		}
	}
	/*
	1
	2 4
	1 3 5
	2 4 6 8
	1 3 5 7 9
	*/
	void np_2()
	{
		int row,col,value;
		for( row = 1; row <= 5; row++ )
		{
			value = 1;
			if( row % 2 == 0 )
			{
				value = 2;
			}
			for( col = 1; col <= row; col++ )
			{
				System.out.print( value + " ");
				value += 2;
			}
			System.out.println();
		}
	}
	/*
	12345
	23451
	34521
	45321
	54321
	*/
	void np_3()
	{
		int row,col;
		for( row = 1; row <= 5; row++ )
		{
			for( col = row; col <= 5; col++ )
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
	/*
	12345
	21234
	32123
	43212
	54321
	*/
	void np_4()
	{
		int row,col;
		for( row = 1; row <= 5; row++ )
		{
			for( col = row; col >= 1; col-- )
			{
				System.out.print(col);
			}
			for( col = 2; col <= 6 - row; col++ )
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
	/*
	1
	23
	4567
	89123456
	7891234567891234
	*/
	void np_5()
	{
		int row,col,times,value;
		times = value = 1;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1; col <= times; col++ )
			{
				System.out.print(value);
				value++;
				if( value == 10 )
				{
					value = 1;
				}
			}
			times = times * 2;
			System.out.println();
		}
	}
	/*
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
	*/
	void np_6()
	{
		int row,col,range;
		range = 1;
		System.out.println("*");
		for( row = 1; row <= 9; row++ )
		{
			System.out.print("*");
			for( col = 1; col <= range; col++ )
			{
				System.out.print(col);				
			}
			for( col = range - 1; col >= 1; col-- )
			{
				System.out.print(col);				
			}						
			System.out.println("*");
			if( row < 5 )
			{
				range++;
			}
			else
			{
				range--;
			}
		}
		System.out.println("*");
	}
/*
                  1
              4   9  16
         25  36  49  64  81
    100 121 144 169 196 225 256
289 324 361 400 441 484 529 576 625
18 14 9 4 0

 4   5 5 4
*/
	void np_7()
	{
		int row,col,value = 1;
		int space = 18;
		for( row = 1; row <= 5; row++ )
		{
			for( col = 1; col <= space; col++ )
			{
				System.out.print(" ");
			}
			for( col = 1; col <= 2 * row - 1; col++ )
			{
				System.out.print(value * value);	
				if( value * value <= 9 )
				{
					System.out.print("   ");
				}
				else if( value * value <= 99 )
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(" ");
				}
				value++;
			}
			System.out.println();			
			if( row == 1 )
			{
				space -= 4;
			}
			else
			{
				space -= 5;
			}
		}
	}
}