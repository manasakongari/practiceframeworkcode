package javapackage;

public class Meow extends Cat{
	
	void run()
	{
		System.out.println("run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Meow c1 = new Meow();
		c1.run();
		c1.sleep();

	}

}
