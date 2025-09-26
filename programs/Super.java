package programs;
class Employee {
	String name;
	int salary;
	
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	void displayInfo() {
		System.out.println("Employee name :"+name);
		System.out.println("Employee sal :"+salary);
		
	}
}
class Manager extends Employee{
	String department;
	
	//Constructor
	Manager(String name,int salary,String department){
		super(name,salary);
		this.department=department;
	}
	void displayInfo() {
		super.displayInfo();
	    System.out.println("Employee Dept :"+department);
	}
}
public class Super {

	public static void main(String[] args) {
		Manager m=new Manager("Skandha",20000,"IT");
		m.displayInfo();
		

	}

}
