class Third
{
	public static void main(String[] args)
	{
		int num = 10;
		long val = 1100;
		//num = (int)(num + val);
		num += val; // num = num + (int)val;
		System.out.println("\n Num : " + num );
	}
}