class UseTest
{
	public static void main(String[] args)
	{
		Test obj = new Test();
		System.out.println(" The value : " + obj.value );
		System.out.println(" The str : " + obj.str );
		System.out.println(" The ans : " + obj.ans );
		System.out.println(" The ut : " + obj.ut );
	}
}
class Test
{
	public int value;
	String str;
	boolean ans;
	UseTest ut;
}