package javapackage;

public class calculator {
	
	static void sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("sum is" +sum);
	}
	static void subst(double c,double d)
	{
		double subst = c-d;
		System.out.println("substraction is" +subst);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(10,20);
		subst(40,10.5);

	}

}
