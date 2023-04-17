//Example of Multilevel_hierarchical Inheritance
package Basic_programs;
//multilevel inheritance
class A //parent
{
   void funcA() {
      System.out.println("This is class A");
   }
}
class B extends A //child of A
{
   void funcB() {
      System.out.println("This is class B");
   }
}
class C extends B //child of B
{
   void funcC() {
      System.out.println("This is class C");
   }
}

//hierarchical inheritance
class Vehicle {

	  double basePrice = 100000;

	  public void showPrice() 
	  {
	    System.out.println("The price of Vehicle is: Rs." + basePrice);
	  }
	}

	class TwoWheeler extends Vehicle {

	  double increasePriceBy = 0.20; // 0.2 times

	  void finalPrice() {
	    basePrice = basePrice + (basePrice * increasePriceBy);
	    System.out.println(
	      "After modification, The price of bike is: Rs." + basePrice
	    );
	  }
	}

	// child class
	class FourWheeler extends Vehicle
  {
	  double increasePriceBy = 1; // 1 times
	  void finalPrice() {
	    basePrice = basePrice + (basePrice * increasePriceBy);
	    System.out.println(
	      "After modification, The price of car is: Rs." + basePrice
	    );
	  }
	}
	public class Multilevel_hierarchical
	{
		   public static void main(String args[])
		   {
		      C obj = new C();
		      obj.funcA();
		      obj.funcB();
		      obj.funcC();
		     
		      TwoWheeler bike = new TwoWheeler();
		      FourWheeler car = new FourWheeler();
		      bike.showPrice();
		       bike.finalPrice();
			    car.showPrice();
	// modifying the base price of car by refferring the base price of vehicle.
			    car.finalPrice();
		   }
	}

	

	  

