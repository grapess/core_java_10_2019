class Six
{
	public static void main(String[] args)
	{
		int count;
		for( count = 1; count <= 100; count++ )
		{
			if( count % 2 == 0 )
			{
				continue;
			}
			if( count == 50 )
			{
				break;
			}			
			System.out.println(" [ " + count + " ]");			
		}
	}
}