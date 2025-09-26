package programs;
class Student{
	Student(){
		String school="SDMIT";
		System.out.println(school);
	}
	Student(String name,int age){
		String name1=name;
		int age2=age;
		System.out.println(name1);
		System.out.println(age2);
	}
}
public class Constructor {

	public static void main(String[] args) {
		    Student s4=new Student();
			Student s=new Student("Skandha",22);
			Student s1=new Student("Sagar",25);
			Student s2 =new Student("Alice",25);
	}

}
