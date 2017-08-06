package factory;

public class PostCodeFactory {
	enum Country {
		US, UK, IN;
	}
	
	public static PostCode getInstance(Country country, String postalCode)
	{
		if (country == Country.US)
			return new _______(postalCode); //> 1
		if (country == Country.UK)
			return new ______(postalCode); //> 2
		if (country == Country.IN)
			return new ______(postalCode); //> 3
		
		return null;
	}
}
