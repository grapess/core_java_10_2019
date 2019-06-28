class UseWork
{
	public static void main(String[] args)
	{
		Work.val = 1004;
		System.out.println(" static val : " + Work.val );
		Work w1 = new Work();
		Work w2 = new Work();
		w1.value = 1100;
		w2.value = 2200;
		System.out.println(" w1 value : " + w1.value);
		System.out.println(" w2 value : " + w2.value);
		w1.val += 104;
		System.out.println(" w1 val : " + w1.val);
		System.out.println(" w2 val : " + w2.val);
	}
}
class Work
{
	public int value;
	static int val;
}