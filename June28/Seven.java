class Seven
{
	static void show()
	{
		System.out.println(" Show Method of Seven Class ");
	}
	public static void main(String[] args)
	{
		System.out.println( Math.sqrt( 33 ));
		Data.display();
		Seven.show();
		show();
	}
}
class Data
{
	static void display()
	{
		System.out.println(" Display Static Method ");
	}
}