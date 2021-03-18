package Solidprinciple.handson.day1.session2;

public class MercedesFactory extends Factory {
	public  HeadLight makeHeadlight()
	{
		return new MercedesHeadlight();
	}
	public  Tire makeTire()
	{
		return new MercedesTire();
	}
}
