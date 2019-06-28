class Five
{
	public void line(char symbol,int times)
	{
		for( int count = 1; count <= times; count++ )
		{
			System.out.print(symbol);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Five obj = new Five();
		obj.line('=',50);
		System.out.println(" Hello");
		obj.line('_',70);
		System.out.println(" Grapess");
		obj.line('~',60);
		System.out.println(" Solutions");
		obj.line('+',40);
	}
}