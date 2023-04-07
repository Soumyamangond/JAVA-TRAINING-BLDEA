package java_training_bldea;
	class Plane {
		 void takeoff() {
			 System.out.println("plane took off");
		 }
		 void fly() {
			 System.out.println("plane is flying");
		 }
		 void land() {
			 System.out.println("plane landed");
		 }
	 }
	 class CargoPlane extends Plane{
		 void fly() {
			 System.out.println("cargo plane flying at low height");
		 }
		 void carryGoods() {
			System.out.println("cargo plane carry goods");
		 }
	 }
	 class FighterPlane extends Plane{
		 void fly() {
			  System.out.println("Fighter plane flying at grater height");
			 }
		 void carryWeapons() {
			 System.out.println("Fighter plane carry weapons");
		 }
		 }
	 
	 class PassengerPlane extends Plane{
		 void fly() {
			  System.out.println(" Passenger plane flying at medium height");
			 }
		 void carryPassenger() {
			 System.out.println("Passenger plane carry passengers");
		 }
		 }
	public class Text20{
		public static void main(String[] args) {
	    CargoPlane cp=new CargoPlane();
	    FighterPlane fp=new FighterPlane();
	    PassengerPlane pp=new PassengerPlane();
	    cp.takeoff();
	    cp.land();
	    cp.carryGoods();
	    System.out.println("---------------");
	    fp.takeoff();
	    fp.fly();
	    fp.land();
	    fp.carryWeapons();
	    System.out.println("---------------");
	    pp.takeoff();
	    pp.fly();
	    pp.land();
	    pp.carryPassenger();
		}
	    
	    }

	    
	    


	 




