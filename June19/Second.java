class Second
{
	public static void main(String[] args)
	{
		byte num = 10;
		num = (byte)(num * num);
		System.out.println("\n Num : " + num );
		char c1 = 'A';
		char c2 = '0';
		char c3 = (char)(c1 + c2);
		System.out.println("\n c1 : " + c1 + " ASCII : " + (int)c1 );
		System.out.println("\n c2 : " + c2 + " ASCII : " + (int)c2 );
		System.out.println("\n c3 : " + c3 + " ASCII : " + (int)c3 );
	}
}