package javapackage;

public class Box {
	
	double a, l, b;
	void area()
	{
		a = l*b;
		System.out.println("area is "+ a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Box box1 = new Box();
		box1.l = 12.5;
		box1.b = 11.0;
		box1.area();
		
		Box box2 = new Box();
		box2.l = 13.2;
		box2.b = 11;
		box2.area();
	}

}
