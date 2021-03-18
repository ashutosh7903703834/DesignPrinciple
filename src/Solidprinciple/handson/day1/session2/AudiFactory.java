package Solidprinciple.handson.day1.session2;

public class AudiFactory extends Factory {

	@Override
	public HeadLight makeHeadlight() {
        return new AudiHeadlight();
		
	}

	@Override
	public Tire makeTire() {
		
		return new AudiTire();
	}

}
