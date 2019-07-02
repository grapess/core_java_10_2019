class Third
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		d1.value = 1245;
		d2.value = 5436;
		d1.show();
		d2.show();
	}
}
class Demo
{
	int value;
	void show()
	{
		System.out.println(" The Value : " + value + "\t" + this.value );
	}
}