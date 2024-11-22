package javapackage;
public class Car extends Vehicle {
	
	String type;
	String features;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		c1.model = " swift";
		c1.color = " black";
		c1.price =  12345;
		c1.number = " abc123";
		c1.type = " petrol";
		c1.display();
		
		Car c2 = new Car();
		c2.model = " nissan";
		c2.color = " white";
		c2.price =  567890;
		c2.number = " ade456";
		c2.type = " deisel";
		c2.display();
		
				
		
		
		

	}

}
