import java.util.*;
class Seven
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Any Number : ");
		int num1 = sc.nextInt();
		System.out.print("\n Enter Any Number : ");
		int num2 = sc.nextInt();
		int hcf,lcm,t1,t2,rem;
		t1 = num1;
		t2 = num2;
		while( t1 % t2 != 0 )
		{
			rem = t1 % t2;
			t1 = t2;
			t2 = rem;
		}
		hcf = t2;
		lcm = ( num1 * num2 ) / hcf;
		System.out.println("\n HCF : " + hcf + " LCM : " + lcm );
	}
}