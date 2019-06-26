import java.util.*;
class Second
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Name : ");
		String name = sc.nextLine();
		switch( name )
		{
			case "ram":
			case "ajay":
				System.out.println("\n VALID USER ");
				break;
			default:
				System.out.println("\n INVALID USER ");
				break;
		}
	}
}