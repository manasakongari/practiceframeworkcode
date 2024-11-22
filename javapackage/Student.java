package javapackage;

public class Student {
	
	int id;
	String name;
	String batch;
	
	
	void showDetails() {
		System.out.println("id is " +id);
		System.out.println("name is " +name);
		System.out.println("class is " +batch);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student1 = new Student();
		student1.id = 1;
		student1.name = "manasa";
		student1.batch= "mpc";
				student1.showDetails();
				
				Student student2 = new Student();
				student2.id = 2;
				student2.name = "shriha";
						student2.batch = "cse";
				student2.showDetails();
		

	}

}
