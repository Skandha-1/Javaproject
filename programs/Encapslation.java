package programs;
class Student1{
	private String name;
	private int age;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age=age;
}}
public class Encapslation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student1 s=new Student1();
        s.setName("Skandha");
        s.setAge(22);
        System.out.println("Name: "+ s.getName());
        System.out.println("Age :"+s.getAge());
	}

}
