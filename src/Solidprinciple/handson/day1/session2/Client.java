package Solidprinciple.handson.day1.session2;
import java.util.Scanner;
public class Client {
	
	
		
		public static Factory getFactory(String factory) {
			if(factory.equals("Mercedes"))
				return new MercedesFactory();
			else
				return new AudiFactory();
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the type of car");
			
			String f=sc.next();
			Factory fact=getFactory(f);
			fact.makeTire().getTire();
			fact.makeHeadlight().getHeadlight();

		}


}
