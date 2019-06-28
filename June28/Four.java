class Four
{
	public void line(char symbol)
	{
		for( int count = 1; count <= 30; count++ )
		{
			System.out.print(symbol);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Four obj = new Four();
		obj.line('=');
		System.out.println(" Hello");
		obj.line('_');
		System.out.println(" Grapess");
		obj.line('~');
		System.out.println(" Solutions");
		obj.line('+');
	}
}