class Thirteen
{
	public static void main(String[] args)
	{
		int num1 = 543; // 1000011111
		int num2 = 234; // 0011101010
		int result = num1 & num2; // 0000001010 = 10
		System.out.println("\n Number 1 : " + num1 + " Number 2 : " + num2 + " Result : " + result);
		result = num1 | num2; // 1011111111 = 767
		System.out.println("\n Number 1 : " + num1 + " Number 2 : " + num2 + " Result : " + result);
		result = num1 ^ num2; // 1011110101 = 757
		System.out.println("\n Number 1 : " + num1 + " Number 2 : " + num2 + " Result : " + result);
	}
}