import java.util.*;
class Third
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int year, totaldays, rem;
		System.out.print("\n Enter Any Year : ");
		year = sc.nextInt();
		// Normal Year :- 365 Days = 52 Weeks + 1 Day
		// Leap Year :- 366 Days = 52 Weeks + 2 Day
		totaldays = ( year - 1 ) * 365;
		totaldays += ( year - 1 ) / 4;
		totaldays -= ( year - 1 ) / 100;
		totaldays += ( year - 1 ) / 400;
		rem = totaldays % 7;
		String result = "\n On 1st January, " + year + " has ";
		if( rem == 0 )
		{
			result += "Monday";
		}
		else
		{
			if( rem == 1 )
			{
				result += "Tuesday";
			}
			else
			{
				if( rem == 2 )
				{
					result += "Wednesday";
				}
				else
				{
					if( rem == 3 )
					{
						result += "Thursday";
					}
					else
					{
						if( rem == 4 )
						{
							result += "Friday";
						}
						else
						{
							if( rem == 5 )
							{
								result += "Saturday";
							}
							else
							{
								result += "Sunday";
							}
						}
					}
				}
			}
		}
		result += ".";
		System.out.println( result );		
	}
}