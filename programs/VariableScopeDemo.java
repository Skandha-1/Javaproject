package programs;
 public class VariableScopeDemo{
	//Instance Variable (each object has its own copy)
	String studentName;
	static String collegeName="SDMIT";
	VariableScopeDemo(String name){
		studentName=name;
	}
	//Meth
	void showDetails() {
		int year=2025;
		System.out.println("Student"+studentName);
		System.out.println("College:"+collegeName);
		System.out.println("Year"+year);
		
		//Block Scope
		if (year>2024) {
			int semester =7;
			System.out.println("Semester"+semester);
		}
	}

	public static void main(String[] args) {
		// TODO-generated method stub
		VariableScopeDemo s1=new VariableScopeDemo("Skandha");
//		s1.studentName="kandha";
		VariableScopeDemo s2=new VariableScopeDemo("Skan");

s1.showDetails();
s2.showDetails();
VariableScopeDemo.collegeName="XYZ";
System.out.println("\nAfter changing static variable");
s1.showDetails();
s2.showDetails();
	}

}
