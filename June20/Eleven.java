class Eleven
{
	public static void main(String[] args)
	{
		int num = 12543; // 11000011111111
		int result = num << 2; // 1100001111111100
		System.out.println("\n Number : " + num + " Result : " + result);
		result = num >> 2; // 110000111111
		System.out.println("\n Number : " + num + " Result : " + result);
		result = ~num; // 00000000 00000000 0110000 11111111
		System.out.println("\n Number : " + num + " Result : " + result);
		System.out.println("\n Number : " + Integer.toBinaryString(num) + " Result : " + Integer.toBinaryString(result));
	}
}