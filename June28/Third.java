class Third
{
	public void line()
	{
		for( int count = 1; count <= 30; count++ )
		{
			System.out.print("~");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Third obj = new Third();
		obj.line();
		System.out.println(" Hello");
		obj.line();
		System.out.println(" Grapess");
		obj.line();
		System.out.println(" Solutions");
		obj.line();
	}
}