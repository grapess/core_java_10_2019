class Twelve
{
	public static void main(String[] args)
	{
		int num = -12543; // 11000011111111
		int result = num >> 2; // 110000111111
		System.out.println("\n Number : " + num + " Result : " + result);
		System.out.println("\n Number : " + Integer.toBinaryString(num) + " Result : " + Integer.toBinaryString(result));
		result = num >>> 2; // 110000111111
		System.out.println("\n Number : " + num + " Result : " + result);
		System.out.println("\n Number : " + Integer.toBinaryString(num) + " Result : " + Integer.toBinaryString(result));
	}
}