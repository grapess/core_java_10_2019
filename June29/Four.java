class Four
{
	public static void main(String[] args)
	{
		Test t1 = new Test( 2200 );
		t1.show();
	}	
}
class Test
{
	private int value;
	Test( int value )
	{
		this.value = value;
	}
	void show()
	{	
		System.out.println(" The Value : " + value );
	}
}