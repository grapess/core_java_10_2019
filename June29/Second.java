class Second
{
	public static void main(String[] args)
	{
		Car obj = new Car();
		//obj.setPrice(-100000);
		System.out.println("\n The Price of Car : " + obj.getPrice() );
	}	
}
class Car
{
	Car()
	{
		price = 543543;
	}
	private int price;
	public void setPrice(int value)
	{
		if( price <= 0 )
		{
			System.out.println(" Invalid Price. So Default Price Taken ");
			price = 50000;
		}
		else
		{
			price = value;
		}
	}
	public int getPrice()
	{
		return price;
	}
}