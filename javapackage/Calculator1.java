package javapackage;

public class Calculator1 {

	void sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("sum is" + sum);
		}
	
	void sum(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("sum is " + sum);
	}
	
	void sum(double d1, double d2)
	{
		double sum = d1+d2;
		System.out.println("sum is" + sum);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator1 c1 = new Calculator1();
		c1.sum(10,21);
		c1.sum(10,20,30);
		c1.sum(10.00,20.10);

	}

}
